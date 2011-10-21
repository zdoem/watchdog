package com.dog.services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.dog.dao.IMembersDogDao;
import com.dog.dao.MembersDog;
import com.dog.services.*;

/*
 * date:2011-01-19
 * author: pradoem wongkraso
 * contact : go2doem@gmail.com,destar_@hotmail.com
 * description: this is class extends from Common(basic connection database)  and implements class IMmembersDogDao
 * suc  create,update,find  it' is class business for operation with database
 * 
 * */

public class MebersDogImpl extends Common implements IMembersDogDao {
     
	//for connection data base
	static
	{
		String dataSource = "jdbc/Datasource_watchdog";
		Common.setConfigForConnectionPool("", dataSource);
		
/*		String usr="root";
		String pwd = "root";
		String host = "localhost";
		String port = "3306";
		String dns= "db_hr";
		Common.setConfig(host, port, dns, usr, pwd);*/
	}
	
	public MembersDog getMemberObj(Integer mId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int create(MembersDog m)  {	
		
		//success return 1
		//fail return 0
	    
		CallableStatement clbstmt = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlcommand = null;
		int i = 1;

	    //***********
		int result = 0;
		boolean check = false;
		//***********
	
		try
		{
			// TODO Auto-generated method stub	
			//connection db
			conn = open();
			
			//***********************Check sum user duplicate **************************************
			sqlcommand = "SELECT username,email FROM MEMBERS_DOG m" +
					" WHERE m.username=? OR m.email=?";
			
			//prepared sql
			pstmt = conn.prepareStatement(sqlcommand);
			
			//set value
			pstmt.setString(i++,m.getUsername());
			pstmt.setString(i++,m.getEmail());
			
			System.out.println("Test ------>> RS:"+pstmt.toString());
			//executeQuery SQL
			rs = pstmt.executeQuery();
			
			
			System.out.println("Test ------>> xxx");
			//##fetch data 
			//Check duplicate user
			while(rs.next()) {
				//return -1;//#End
				check = true;
	        }
			
			
			if(!check){   
				 //Insert to DB
				//CallableStatement stmt = null;
				
				 i=1;
				 clbstmt = conn.prepareCall("{call db_watchdog.INSERT_MEMBERS_DOG(?,?,?,?,?,?,?)}");
				 clbstmt.setString(i++,m.getUsername());
				 clbstmt.setString(i++,m.getPassword());
				 clbstmt.setString(i++,m.getNickname());
				 clbstmt.setString(i++,m.getEmail());
				 clbstmt.setString(i++,m.getPosition());
				 clbstmt.setString(i++,m.getOnline());
				 clbstmt.setString(i++,m.getAbout_me());
			     
				 System.out.println("Test ------>> eeeeeeeeeeeeee");
				 result = clbstmt.executeUpdate();	     
			}
			else{
				return -1;//#End
			}
	        //************END************************************************************************
			//IN p_usr varchar(80),
			//IN p_pwd varchar(80),
			//IN p_nickname varchar(80),
			//IN p_email varchar(80),
			//IN p_position varchar(256),
			//IN p_online  varchar(256),
			//IN p_about_me text
		}
		catch(Exception e){
			
			e.fillInStackTrace();
			return result;//#End
		}
		
		finally{
			try {
				//conn.close(pstmt,rs,conn);
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
				if(clbstmt!=null)
					clbstmt.close();
				if(conn!=null)
					conn.close();
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//*******Return*********
		return result;//#End
	}
	

	public int update(MembersDog m) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(MembersDog m) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Integer mId) throws Exception {
		// TODO Auto-generated method stub
		
		return 0;
	}

	public List<MembersDog> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
