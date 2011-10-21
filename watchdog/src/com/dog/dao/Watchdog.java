package com.dog.dao;

import java.lang.reflect.Field;

/*
 * date:2011-01-19
 * author: pradoem wongkraso
 * contact : go2doem@gmail.com,destar_@hotmail.com
 * description: bean mapping form & controller & validation
 * 
 * */
public class Watchdog {
	
	private String oid; //char(13)
	private int mid; //int(5)
	private String issue_of_title; //text
	private String type_of_bug;
	private String solution_of_trick;
	private String doc_ref;//varchar(256)
	private String project_ref;//varchar(256)
	private String comment1;
	private String date_dog;//timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getIssue_of_title() {
		return issue_of_title;
	}
	public void setIssue_of_title(String issue_of_title) {
		this.issue_of_title = issue_of_title;
	}
	public String getType_of_bug() {
		return type_of_bug;
	}
	public void setType_of_bug(String type_of_bug) {
		this.type_of_bug = type_of_bug;
	}
	public String getSolution_of_trick() {
		return solution_of_trick;
	}
	public void setSolution_of_trick(String solution_of_trick) {
		this.solution_of_trick = solution_of_trick;
	}
	public String getDoc_ref() {
		return doc_ref;
	}
	public void setDoc_ref(String doc_ref) {
		this.doc_ref = doc_ref;
	}
	public String getProject_ref() {
		return project_ref;
	}
	public void setProject_ref(String project_ref) {
		this.project_ref = project_ref;
	}
	public String getComment1() {
		return comment1;
	}
	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}
	public String getDate_dog() {
		return date_dog;
	}
	public void setDate_dog(String date_dog) {
		this.date_dog = date_dog;
	}
	
	@Override
	public String toString() {
	       Class c = this.getClass();
	       StringBuilder buffer = new StringBuilder();
	       for (Field field :c.getDeclaredFields()) {
	           try {
	               buffer.append("   ");
	               buffer.append(field.getName());
	               buffer.append(":");
	               buffer.append(field.get(this));
	           } catch (IllegalArgumentException ex) {
	               //Logger.getLogger(TollLaneEvents.class.getName()).log(Level.SEVERE, null, ex);
	           } catch (IllegalAccessException ex) {
	               //Logger.getLogger(TollLaneEvents.class.getName()).log(Level.SEVERE, null, ex);
	           }
	       }
	       return buffer.toString();
	   }
}
