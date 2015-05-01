package com.server.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.server.bean.Workshop;

@Repository("workshopDao")
public class WorkshopDao implements BaseDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insert(Object o) {
		Workshop w = (Workshop) o;
		String sql = "INSERT INTO workshop VALUES(?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, 
				w.getID(),
				w.getType(),
				w.getbTime(),
				w.getManufacturer(),
				w.getPrincipal());
		
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean delete(String ID) {
		String sql = "DELETE FROM workshop WHERE ID = ?";
		int result = jdbcTemplate.update(sql, ID);
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean update(Object o) {
		Workshop w = (Workshop) o;
		String sql = "UPDATE workshop SET type=?,bTime=?," +
				"manufacture=?,principal=? WHERE ID=?";
		int result = jdbcTemplate.update(sql, 
				w.getType(),
				w.getbTime(),
				w.getManufacturer(),
				w.getPrincipal(),
				w.getID());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public Object queryById(String ID) {
		String sql = "SELECT * FROM workshop WHERE ID = ?";
		final Workshop w = new Workshop();
		jdbcTemplate.query(sql, new Object[]{ID}, new RowCallbackHandler(){
			public void processRow(ResultSet arg0) throws SQLException {
				w.setID(arg0.getString("ID"));
				w.setType(arg0.getString("type"));
				w.setbTime(arg0.getString("bTime"));
				w.setManufacturer(arg0.getString("manufacture"));
				w.setPrincipal(arg0.getString("principal"));
			}
		});
		return w;
	}

	public List<?> query(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Workshop> find() {
		String sql = "SELECT * FROM workshop";
		List<Workshop> results = jdbcTemplate.query(
                sql, new RowMapper<Workshop>() {
                    public Workshop mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	Workshop w = new Workshop();
        				w.setID(rs.getString("ID"));
        				w.setType(rs.getString("type"));
        				w.setbTime(rs.getString("bTime"));
        				w.setManufacturer(rs.getString("manufacture"));
        				w.setPrincipal(rs.getString("principal"));
        				return w;
                    }
                });
		return results;
	}

}
