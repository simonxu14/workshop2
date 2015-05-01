package com.server.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.server.bean.Manufacturer;

@Repository("manufacturerDao")
public class ManufacturerDao implements BaseDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean insert(Object o) {
		Manufacturer m = (Manufacturer) o;
		String sql = "INSERT INTO manufacturer VALUES(?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, 
				m.getID(),
				m.getName(),
				m.getPrincipal(),
				m.getPhone(),
				m.getAddress());
		
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean delete(String ID) {
		String sql = "DELETE FROM manufacturer WHERE ID = ?";
		int result = jdbcTemplate.update(sql, ID);
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean update(Object o) {
		Manufacturer m = (Manufacturer) o;
		String sql = "UPDATE manufacturer SET name=?,pancipal=?," +
				"phone=?,address=? WHERE ID=?";
		int result = jdbcTemplate.update(sql, 
				m.getName(),
				m.getPrincipal(),
				m.getPhone(),
				m.getAddress(),
				m.getID());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public Object queryById(String ID) {
		String sql = "SELECT * FROM manufacturer WHERE ID = ?";
		final Manufacturer m = new Manufacturer();
		jdbcTemplate.query(sql, new Object[]{ID}, new RowCallbackHandler(){
			public void processRow(ResultSet arg0) throws SQLException {
				m.setID(arg0.getString("ID"));
				m.setName(arg0.getString("name"));
				m.setPrincipal(arg0.getString("pancipal"));
				m.setPhone(arg0.getString("phone"));
				m.setAddress(arg0.getString("address"));
			}
		});
		return m;
	}

	public List<?> query(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Manufacturer> find() {
		String sql = "SELECT * FROM manufacturer";
		List<Manufacturer> results = jdbcTemplate.query(
                sql, new RowMapper<Manufacturer>() {
                    public Manufacturer mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	Manufacturer m = new Manufacturer();
        				m.setID(rs.getString("ID"));
        				m.setName(rs.getString("name"));
        				m.setPrincipal(rs.getString("pancipal"));
        				m.setPhone(rs.getString("phone"));
        				m.setAddress(rs.getString("address"));
        				return m;
                    }
                });
		return results;
	}
}
