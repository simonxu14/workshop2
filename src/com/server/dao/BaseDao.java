package com.server.dao;

import java.util.List;

/**
 * 
 * @author Kameleon
 * 数据访问层接口类
 *
 */
public interface BaseDao {
	public boolean insert(Object o);
	public boolean delete(String ID);
	public boolean update(Object o);
	public Object queryById(String ID);
	public List<?> query(Object o);
	public List<?> find();
}
