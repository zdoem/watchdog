package com.dog.services;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.dog.dao.IWatchdogDao;
import com.dog.dao.Watchdog;
/*
 * date:2011-01-19
 * author: pradoem wongkraso
 * contact : go2doem@gmail.com,destar_@hotmail.com
 * description: this is class extends from Common(basic connection database)  and implements class IWatchdogDao
 * suc  create,update,find  it' is class business for operation with database
 * 
 * */

//extend & Implement form Interface
public class WatchdogImpl extends Common implements IWatchdogDao{
	private static org.apache.log4j.Logger Log = Logger.getLogger(WatchdogImpl.class);
	
	//for connection data base
	static{
		String dataSource = "jdbc/Datasource_watchdog"; //jdbc/Datasource_watchdog
		Common.setConfigForConnectionPool("", dataSource);
		
/*		String usr="root";
		String pwd = "root";
		String host = "localhost";
		String port = "3306";
		String dns= "db_hr";
		Common.setConfig(host, port, dns, usr, pwd);*/
	}

	public Watchdog getWatchdogObj(String oId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int create(Watchdog w) throws Exception {
		// TODO Auto-generated method stub
		
		
		return 0;
	}

	public int update(Watchdog w) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Watchdog w) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(String oId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList findByName(String bugs) throws Exception {
		// TODO Auto-generated method stub
		Log.debug("List Watchdog..");
		Connection conn		=	null;
		ResultSet rs 		= 	null;
		PreparedStatement pstmt = null;
		String sql				="";
		Watchdog  dogObj =null;
	    ArrayList result = new ArrayList();
		
	    try{	 
			 //connection
	    	 conn = open();
	    	 Log.debug("Open connection");	    	 
	    	 //setTransaction 
	    	 
	    	 sql="SELECT members_dog.mid, watchdog.mid, watchdog.oid,watchdog.issue_of_title, watchdog.type_of_bug," +
	    	 		" watchdog.solution_of_trick, watchdog.doc_ref, watchdog.project_ref, watchdog.comment1, watchdog.date_dog," +
	    	 		" members_dog.username, members_dog.password,members_dog.email, members_dog.active_flag, members_dog.date_dog" +
	    	 		" FROM    db_watchdog.members_dog members_dog" +
	    	 		" INNER JOIN db_watchdog.watchdog watchdog ON (members_dog.mid = watchdog.mid)" ;
	    	 
	    	 String where = " WHERE";	    	   		 	               
	    	 if (!bugs.equals("")) { 
	                	where+= " (watchdog.issue_of_title = ? ) OR (watchdog.issue_of_title LIKE ?)   AND";
	           }	               
	           //Cutting
	          sql += where.trim().substring(0, where.length()-6);	    	 	
  
	    	  pstmt = conn.prepareStatement(sql);
	    	  Log.debug(sql);
	    	  
	    	 int i=1;
	         if (!bugs.equals("")) { 
	              pstmt.setString(i++, bugs);
	              pstmt.setString(i++,"%"+bugs+"%");	                	
	              Log.debug("-------watchdog.issue_of_title key-in---------");
	         }

	    	  Log.equals("---->>"+pstmt.toString());
		      rs = pstmt.executeQuery();
		      Log.debug("execute SQL Query.");
	    	  
		      int c=0;
	 		  while(rs.next()){	 			  
	 			  //Watchdog
	 			 dogObj = new Watchdog();
	 			 dogObj.setOid(rs.getString("oid"));
	 			 dogObj.setMid(rs.getInt("mid"));
	 			 dogObj.setIssue_of_title(rs.getString("issue_of_title"));
	 			 dogObj.setType_of_bug(rs.getString("type_of_bug"));
	 			 dogObj.setSolution_of_trick(rs.getString("solution_of_trick"));
	 			 dogObj.setDoc_ref(rs.getString("doc_ref"));
	 			 dogObj.setProject_ref(rs.getString("project_ref"));
	 			 dogObj.setComment1(rs.getString("comment1"));
	 			 dogObj.setDate_dog(rs.getString("date_dog"));
	 			 
	 			 result.add(dogObj);
	 			 c++;
	 		}
	 		  
	 		Log.debug("get UserInfo FetchSize :"+c);
	        //Commit Transaction
		}catch(Exception e){
			e.printStackTrace();
			 Log.debug(" "+e.getMessage());
		}
		finally{ 
			//close
			try{
				rs.close();
				pstmt.close();
			    close(conn); 
			}catch(Exception e){}		    
			Log.debug("close connection ");
		} 
	    
	   return result;
	}
	
	//Find OID next Record
	private String getNextOID() throws Exception{
		
		return "";
	}

	
}
