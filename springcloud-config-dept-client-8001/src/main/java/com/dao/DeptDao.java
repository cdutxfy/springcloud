package com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.entities.*;

@Mapper
public interface DeptDao
{
  public boolean addDept(DeptEntity dept);

  public DeptEntity findById(Long id);

  public List<DeptEntity> findAll();

}

 