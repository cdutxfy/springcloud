package com.controller;

import com.entities.DeptEntity;
import com.service.DeptClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author XianFeiyue
 * @description
 */
@RestController
public class DeptConsumerController {

	@Autowired
	private DeptClientService deptClientService;// Feign面向接口编程

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(DeptEntity deptEntity) {
		// 三个参数：url,requestMap ResponseBean.class
		return deptClientService.add(deptEntity);
	}

	@RequestMapping("/consumer/dept/findById/{deptNo}")
	public DeptEntity findById(@PathVariable("deptNo") Long deptNo) {
		// 三个参数：url,requestMap ResponseBean.class
		return deptClientService.findById(deptNo);
	}

	@RequestMapping(value = "/consumer/dept/findAll")
	public List findAll() {
		// 三个参数：url,requestMap ResponseBean.class
		return deptClientService.findAll();
	}
}