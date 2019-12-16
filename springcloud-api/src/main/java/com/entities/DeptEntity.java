package com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author XianFeiyue
 * @description 部门实体类
 */
@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class DeptEntity implements Serializable {
	/**
	 * 部门编码 主键
	 */
	private Long deptNo;
	/**
	 * 部门名称
	 */
	private String dname;
	/**
	 * 数据库名称
	 */
	private String db_source;

	public DeptEntity(String dname) {
		super();
		this.dname = dname;
	}

}