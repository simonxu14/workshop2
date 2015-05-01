package com.server.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.server.bean.DynamicWorkshop;

@Repository("dynamicWorkshopDap")
public class DynamicWorkshopDao implements BaseDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insert(Object o) {
		DynamicWorkshop d = (DynamicWorkshop) o;
		String sql = "INSERT INTO dynamic_workshop_information VALUES(?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, 
				d.getID(),
				d.getWorkshopID(),
				d.getTemperature(),
				d.getHumidity(),
				d.getNoise());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean delete(String ID) {
		String sql = "DELETE FROM dynamic_workshop_information WHERE ID = ?";
		int result = jdbcTemplate.update(sql, ID);
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean update(Object o) {
		DynamicWorkshop d = (DynamicWorkshop) o;
		String sql = "UPDATE dynamic_workshop_information SET workshopID=?," +
				"temperature=?,humidity=?,noise=? WHERE ID=?";
		int result = jdbcTemplate.update(sql, 
				d.getWorkshopID(),
				d.getTemperature(),
				d.getHumidity(),
				d.getNoise(),
				d.getID());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public Object queryById(String ID) {
		String sql = "SELECT * FROM dynamic_workshop_information WHERE ID = ?";
		final DynamicWorkshop d = new DynamicWorkshop();
		jdbcTemplate.query(sql, new Object[]{ID}, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				d.setID(rs.getString("ID"));
				d.setWorkshopID(rs.getString("workshopID"));
				d.setTemperature(rs.getString("temperature"));
				d.setHumidity(rs.getString("humidity"));
				d.setNoise(rs.getString("noise"));
			}
		});
		return d;
	}

	public List<?> query(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<?> find() {
		String sql = "SELECT * FROM dynamic_workshop_information";
		List<DynamicWorkshop> results = jdbcTemplate.query(
                sql, new RowMapper<DynamicWorkshop>() {
                    public DynamicWorkshop mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	DynamicWorkshop d = new DynamicWorkshop();
                    	d.setID(rs.getString("ID"));
        				d.setWorkshopID(rs.getString("workshopID"));
        				d.setTemperature(rs.getString("temperature"));
        				d.setHumidity(rs.getString("humidity"));
        				d.setNoise(rs.getString("noise"));
        				return d;
                    }
                });
		return results;
	}
	
	/**
	 * 汇总车间动态信息
	 * @param workshopID
	 * @return
	 */
	public List<DynamicWorkshop> queryByWorkshopID(String workshopID){
		String sql = "SELECT * FROM dynamic_workshop_information WHERE workshopID = ?";
		List<DynamicWorkshop> results = jdbcTemplate.query(
                sql, new Object[]{workshopID},new RowMapper<DynamicWorkshop>() {
                    public DynamicWorkshop mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	DynamicWorkshop d = new DynamicWorkshop();
                    	d.setID(rs.getString("ID"));
        				d.setWorkshopID(rs.getString("workshopID"));
        				d.setTemperature(rs.getString("temperature"));
        				d.setHumidity(rs.getString("humidity"));
        				d.setNoise(rs.getString("noise"));
        				return d;
                    }
                });
		return results;
	}
}
