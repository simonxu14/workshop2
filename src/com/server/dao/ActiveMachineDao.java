package com.server.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.server.bean.ActiveMachine;
import com.server.util.Reverse;

@Repository("activeMachineDao")
public class ActiveMachineDao implements BaseDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insert(Object o) {
		ActiveMachine a = (ActiveMachine) o;
		String sql = "INSERT INTO active_machine_tool_information VALUES(?,?,?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, 
				a.getID(),
				a.getTime(),
				a.getMoveTime(),
				a.getRestTime(),
				a.getDisplacement(),
				a.getsTime(),
				a.getMachineID());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean delete(String ID) {
		String sql = "DELETE FROM active_machine_tool_information WHERE ID = ?";
		int result = jdbcTemplate.update(sql, ID);
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean update(Object o) {
		ActiveMachine a = (ActiveMachine) o;
		String sql = "UPDATE active_machine_tool_information SET time=?,moveTime=?,restTime=?," +
				"displacement=?,sTime=?,machine=? WHERE ID=?";;
		int result = jdbcTemplate.update(sql, 
				a.getTime(),
				a.getMoveTime(),
				a.getRestTime(),
				a.getDisplacement(),
				a.getsTime(),
				a.getMachineID(),
				a.getID());
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}

	public Object queryById(String ID) {
		String sql = "SELECT * FROM active_machine_tool_information WHERE ID = ?";
		final ActiveMachine a = new ActiveMachine();
		jdbcTemplate.query(sql, new Object[]{ID}, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				a.setID(rs.getString("ID"));
				a.setTime(rs.getString("time"));
				a.setMoveTime(rs.getString("moveTime"));
				a.setRestTime(rs.getString("restTime"));
				a.setDisplacement(rs.getString("displacement"));
				a.setsTime(rs.getString("sTime"));
				a.setMachineID(rs.getString("machine"));
			}
		});
		return a;
	}

	public List<?> query(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<?> find() {
		String sql = "SELECT * FROM active_machine_tool_information";
		List<ActiveMachine> results = jdbcTemplate.query(
                sql, new RowMapper<ActiveMachine>() {
                    public ActiveMachine mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	ActiveMachine a = new ActiveMachine();
                    	a.setID(rs.getString("ID"));
        				a.setTime(rs.getString("time"));
        				a.setMoveTime(rs.getString("moveTime"));
        				a.setRestTime(rs.getString("restTime"));
        				a.setDisplacement(rs.getString("displacement"));
        				a.setsTime(rs.getString("sTime"));
        				a.setMachineID(rs.getString("machine"));
        				return a;
                    }
                });
		return results;
	}
	
	/**
	 * 汇总机床动态信息
	 * @param machineID
	 * @return
	 */
	public List<ActiveMachine> queryByMachineID(String machineID){
		String sql = "SELECT * FROM active_machine_tool_information WHERE machine=?";
		List<ActiveMachine> results = jdbcTemplate.query(
                sql, new Object[]{machineID},new RowMapper<ActiveMachine>() {
                    public ActiveMachine mapRow(ResultSet rs, int rowNum) throws SQLException {
                    	ActiveMachine a = new ActiveMachine();
                    	a.setID(rs.getString("ID"));
        				a.setTime(rs.getString("time"));
        				a.setMoveTime(rs.getString("moveTime"));
        				a.setRestTime(rs.getString("restTime"));
        				a.setDisplacement(rs.getString("displacement"));
        				a.setsTime(rs.getString("sTime"));
        				a.setMachineID(rs.getString("machine"));
        				return a;
                    }
                });
		return results;
	}

	/**
	 * 获取请求时间段至00:00:00的所有数据
	 * @param machineID
	 * @param requestTime
	 * @param timespace
	 * @return
	 */
	public List<ActiveMachine> queryByMachineID(String machineID,String requestTime,String timespace){
		String sql = "SELECT * FROM active_machine_tool_information WHERE time " +
				"BETWEEN ? AND ? AND machine = ? GROUP BY time ASC";
		Date startDate = Reverse.StringToDate(requestTime);
		startDate.setHours(0);
		startDate.setMinutes(0);
		startDate.setSeconds(0);
		Date endDate = Reverse.StringToDate(requestTime);
		
		List<ActiveMachine> results = jdbcTemplate.query(
                sql, 
                new Object[]{Reverse.DateToString(startDate),Reverse.DateToString(endDate),machineID},
                new RowMapper<ActiveMachine>() {
                    public ActiveMachine mapRow(ResultSet rs, int rowNum) throws SQLException {
                		
                    	ActiveMachine a = new ActiveMachine();
                    	a.setID(rs.getString("ID"));
        				a.setTime(rs.getString("time"));
        				a.setMoveTime(rs.getString("moveTime"));
        				a.setRestTime(rs.getString("restTime"));
        				a.setDisplacement(rs.getString("displacement"));
        				a.setsTime(rs.getString("sTime"));
        				a.setMachineID(rs.getString("machine"));
        				return a;
                    }
                });
		return results;
	}
	
	/**
	 * 按时间段汇总数据
	 * @param machineID
	 * @param requestTime
	 * @param timespace
	 * @return
	 */
	public List<ActiveMachine> gatherDataByTimeSpace(String machineID,String requestTime,String timespace){
		List<ActiveMachine> list = queryByMachineID(machineID, requestTime, timespace);
		List<ActiveMachine> gatherList = new ArrayList<ActiveMachine>();
		
		Date startTime;
		Date endTime;
		Date timeRequest = Reverse.StringToDate(requestTime);
		int tempCount = 0;//统计每个时间段内有多少条数据
		
		if(list.size() == 0){
			return gatherList;
		}else{
			//讲开始时间置为当前日期的00:00:00
			startTime = Reverse.StringToDate(list.get(0).getTime());
			startTime.setHours(0);
			startTime.setMinutes(0);
			startTime.setSeconds(0);
			
			int totalMoveTime = 0;
			int totalRestTime = 0;
			int totalDisplacement = 0;
			int totalSTime = 0;
			
			boolean flag = false;
			
			final Calendar calendar = Calendar.getInstance();
			calendar.setTime(startTime);
			calendar.add(Calendar.MINUTE,Integer.parseInt(timespace));
			endTime = calendar.getTime();
			while(startTime.compareTo(timeRequest) == -1){

				
				for(int i = 0;i < list.size();i++){
					Date time = Reverse.StringToDate(list.get(i).getTime());
					
					if(time.compareTo(startTime) != -1
							&& time.compareTo(endTime) == -1){
						++tempCount;
						totalMoveTime = totalMoveTime + Integer.parseInt(list.get(i).getMoveTime());
						totalRestTime = totalRestTime + Integer.parseInt(list.get(i).getRestTime());
						totalDisplacement = totalDisplacement + Integer.parseInt(list.get(i).getDisplacement());
						totalSTime = totalSTime + Integer.parseInt(list.get(i).getsTime());
					}else{
						flag = true;
					}
					//如果当前的数据是链表中最后一个数据，并且未满足时间间隔，那么及时将已经统计的数据放进新的链表
					if((list.size() - i) == 1){
						flag = true;
					}
					//每隔一个时间段就将数据放进数组中
					if(flag){
						ActiveMachine am = new ActiveMachine();
						am.setID(list.get(i).getID());
						am.setDisplacement(String.valueOf(totalDisplacement));
						am.setMachineID(list.get(0).getMachineID());
						am.setMoveTime(String.valueOf(totalMoveTime / tempCount));
						am.setRestTime(String.valueOf(totalRestTime / tempCount));
						am.setsTime(String.valueOf(totalSTime / tempCount));
						am.setTime(Reverse.DateToString(endTime));
						gatherList.add(am);
						
						startTime = endTime;
						calendar.setTime(startTime);
						calendar.add(Calendar.MINUTE,Integer.parseInt(timespace));
						endTime = calendar.getTime();
						totalMoveTime = Integer.parseInt(list.get(i).getMoveTime());
						totalRestTime = Integer.parseInt(list.get(i).getRestTime());
						totalDisplacement = Integer.parseInt(list.get(i).getDisplacement());
						totalSTime = Integer.parseInt(list.get(i).getsTime());
						tempCount = 1;
						flag = false;
					}
				}

			}
			return gatherList;
		}
	}
}
