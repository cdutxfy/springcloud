package com.controller;

import com.entities.DeptEntity;
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

//	使用restTemplate访问restful接口非常的简单粗暴无脑。
//	(url, requestMap, ResponseBean.class)这三个参数分别代表 
//	REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。

	/**
	 * 注册再EurekaServer中的微服务名称
	 */
  private static final String REST_URL_PREFIX = "http://localhost:8001";
//	private static final String REST_URL_PREFIX = "http://STUDY-SPRINGCLOUD-DEPT";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(DeptEntity deptEntity) {
		// 三个参数：url,requestMap ResponseBean.class
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", deptEntity, Boolean.class);
	}

	@RequestMapping("/consumer/dept/findById/{deptNo}")
	public DeptEntity findById(@PathVariable("deptNo") Long deptNo) {
		// 三个参数：url,requestMap ResponseBean.class
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/findById/" + deptNo, DeptEntity.class);
	}

	@RequestMapping("/consumer/dept/findAll")
	public List<DeptEntity> findAll() {
		// 三个参数：url,requestMap ResponseBean.class
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/findAll", List.class);
	}

	@RequestMapping(value = "/consumer/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
	}
}