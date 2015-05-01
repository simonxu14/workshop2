package com.server.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.server.bean.Profession;

@Repository("professoinDao")
public class ProfessionDao implements BaseDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insert(Object o) {
		Profession p = (Profession) o;
		String sql = "INSERT INTO profession VALUES(?,?)";
		int result = jdbcTemplate.update(sql, 
				p.getID(),
				p.getName());
		
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean delete(String ID) {
		String sql = "DELETE FROM profession WHERE ID = ?";
		int result = jdbcTemplate.update(sql, ID);
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean update(Object o) {
		Profession p = (Profession) o;
		String sql = "UPDATE profession SET name=? WHERE ID=?";
		int result = jdbcTemplate.update(sql, 
				p.getID(),
				p.getName());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public Object queryById(String ID) {
		String sql = "SELECT * FROM profession WHERE ID = ?";
		final Profession p = new Profession();
		jdbcTemplate.query(sql, new Object[]{ID}, new RowCallbackHandler(){
			public void processRow(ResultSet arg0) throws SQLException {
				p.setID(arg0.getString("ID"));
				p.setName(arg0.getString("name"));
			}
		});
		return p;
	}

	public List<?> query(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<?> find() {
		String sql = "SELECT * FROM profession";
		List<Profession> results = jdbcTemplate.query(
                sql, new RowMapper<Profession>() {
                    public Profession mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	Profession p = new Profession();
        				p.setID(rs.getString("ID"));
        				p.setName(rs.getString("name"));
        				return p;
                    }
                });
		return results;
	}

}
