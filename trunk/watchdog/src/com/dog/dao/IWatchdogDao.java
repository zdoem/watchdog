package com.dog.dao;
import java.util.List;

/*
 * date:2011-01-19
 * author: pradoem wongkraso
 * contact : go2doem@gmail.com,destar_@hotmail.com
 * description: this is class interface with have other class implement prototype
 * 
 * */

public interface IWatchdogDao {
	
	public Watchdog getWatchdogObj(String oId) throws Exception; 
	public int create(Watchdog w) throws Exception;
	public int update(Watchdog w) throws Exception;
	public int delete(Watchdog w) throws Exception;
	public int delete(String oId) throws Exception;
	public List<Watchdog> findByName(String name) throws Exception;


}
