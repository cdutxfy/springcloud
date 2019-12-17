package com.service.Impl;

import com.dao.DeptDao;
import com.entities.DeptEntity;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XianFeiyue
 * @description
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptDao deptDao;
    @Override
    public boolean addDept(DeptEntity deptEntity) {
      return   deptDao.addDept(deptEntity);
    }

    @Override
    public DeptEntity findById(Long deptNo) {
        return  deptDao.findById(deptNo);
    }

    @Override
    public List<DeptEntity> findAll() {
        return deptDao.findAll();
    }
}