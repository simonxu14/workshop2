package com.server.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.server.bean.Worker;

@Repository("workerDao")
public class WorkerDao implements BaseDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insert(Object o) {
		Worker w = (Worker) o;
		String sql = "INSERT INTO worker VALUES(?,?,?,?,?,?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, 
				w.getID(),
				w.getName(),
				w.getAuthority(),
				w.getIDCard(),
				w.getProfession(),
				w.getpNumber(),
				w.getSex(),
				w.getAge(),
				w.getAddress(),
				w.getEmail());
		
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean delete(String ID) {
		String sql = "DELETE FROM worker WHERE ID = ?";
		int result = jdbcTemplate.update(sql, ID);
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean update(Object o) {
		Worker w = (Worker) o;
		String sql = "UPDATE worker SET name=?,Authority=?,IDCard=?," +
				"profession=?,pNumber=?,sex=?,age=?,address=?,email=? WHERE ID=?";
		int result = jdbcTemplate.update(sql, 
				w.getName(),
				w.getAuthority(),
				w.getIDCard(),
				w.getProfession(),
				w.getpNumber(),
				w.getSex(),
				w.getAge(),
				w.getAddress(),
				w.getEmail(),
				w.getID());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public Object queryById(String ID) {
		String sql = "SELECT * FROM worker WHERE ID = ?";
		final Worker w = new Worker();
		jdbcTemplate.query(sql, new Object[]{ID}, new RowCallbackHandler(){
			public void processRow(ResultSet arg0) throws SQLException {
				w.setID(arg0.getString("ID"));
				w.setName(arg0.getString("name"));
				w.setAuthority(arg0.getString("Authority"));
				w.setIDCard(arg0.getString("IDCard"));
				w.setProfession(arg0.getString("profession"));
				w.setpNumber(arg0.getString("pNumber"));
				w.setSex(arg0.getString("sex"));
				w.setAge(arg0.getString("age"));
				w.setAddress(arg0.getString("address"));
				w.setEmail(arg0.getString("email"));
				
			}
		});
		return w;
	}

	public List<?> query(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Worker> find() {
		String sql = "SELECT * FROM worker";
		List<Worker> results = jdbcTemplate.query(
                sql, new RowMapper<Worker>() {
                    public Worker mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	Worker w = new Worker();
        				w.setID(rs.getString("ID"));
        				w.setName(rs.getString("name"));
        				w.setAuthority(rs.getString("Authority"));
        				w.setIDCard(rs.getString("IDCard"));
        				w.setProfession(rs.getString("profession"));
        				w.setpNumber(rs.getString("pNumber"));
        				w.setSex(rs.getString("sex"));
        				w.setAge(rs.getString("age"));
        				w.setAddress(rs.getString("address"));
        				w.setEmail(rs.getString("email"));
        				return w;
                    }
                });
		return results;
	}
}
