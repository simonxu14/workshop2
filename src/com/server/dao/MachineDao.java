package com.server.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.server.bean.Machine;

@Repository("machineDao")
public class MachineDao implements BaseDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean insert(Object o) {
		Machine m = (Machine) o;
		String sql = "INSERT INTO machine_tool_information VALUES (?,?,?,?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, 
				m.getID(),
				m.getType(),
				m.getmNumber(),
				m.getsNumber(),
				m.getWorkshop(),
				m.getManufacturer(),
				m.getpDate(),
				m.getWorkerID());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean delete(String ID) {
		String sql = "DELETE FROM machine_tool_information WHERE ID = ?";
		int result = jdbcTemplate.update(sql, ID);
		if(result == 0){
			return false;
		}else{
			return true;
		}	
	}

	public boolean update(Object o) {
		Machine m = (Machine) o;
		String sql = "UPDATE machine_tool_information SET type=?,mNumber=?,sNumber=?," +
				"workshop=?,manufacture=?,pDate=?,workerID=? WHERE ID=?";
		int result = jdbcTemplate.update(sql, 
				m.getType(),
				m.getmNumber(),
				m.getsNumber(),
				m.getWorkshop(),
				m.getManufacturer(),
				m.getpDate(),
				m.getWorkerID(),
				m.getID());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public Object queryById(String ID) {
		String sql = "SELECT * FROM machine_tool_information WHERE ID = ?";
		final Machine m = new Machine();
		jdbcTemplate.query(sql, new Object[]{ID}, new RowCallbackHandler(){
			public void processRow(ResultSet arg0) throws SQLException {
				m.setID(arg0.getString("ID"));
				m.setType(arg0.getString("type"));
				m.setmNumber(arg0.getString("mNumber"));
				m.setsNumber(arg0.getString("sNumber"));
				m.setWorkshop(arg0.getString("workshop"));
				m.setManufacturer(arg0.getString("manufacture"));
				m.setpDate(arg0.getString("pDate"));
				m.setWorkerID(arg0.getString("workerID"));
			}
		});
		return m;
	}

	public List<Object> query(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Machine> find() {
		String sql = "SELECT * FROM machine_tool_information";
		List<Machine> results = jdbcTemplate.query(
                sql, new RowMapper<Machine>() {
                    public Machine mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	Machine m = new Machine();
        				m.setID(rs.getString("ID"));
        				m.setType(rs.getString("type"));
        				m.setmNumber(rs.getString("mNumber"));
        				m.setsNumber(rs.getString("sNumber"));
        				m.setWorkshop(rs.getString("workshop"));
        				m.setManufacturer(rs.getString("manufacture"));
        				m.setpDate(rs.getString("pDate"));
        				m.setWorkerID(rs.getString("workerID"));
        				return m;
                    }
                });
		return results;
	}
}
