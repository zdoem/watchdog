package com.dog.dao;

import java.util.List;
/*
 * date:2011-01-19
 * author: pradoem wongkraso
 * contact : go2doem@gmail.com,destar_@hotmail.com
 * description: this is class interface with have other class implement prototype
 * 
 * */
public interface IMembersDogDao {
	
	public MembersDog getMemberObj(Integer mId) throws Exception; 
	public int create(MembersDog m) throws Exception;
	public int update(MembersDog m) throws Exception;
	public int delete(MembersDog m) throws Exception;
	public int delete(Integer mId) throws Exception;
	public List<MembersDog> findByName(String name) throws Exception;

}
