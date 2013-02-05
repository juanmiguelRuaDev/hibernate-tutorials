package org.hibernate.tutorial.hbm;

import java.util.Date;

public class OperationModel {
	
	private int id;
	private Date date;
	
	
	
	
	
	public OperationModel(){
		
	}
	
	public OperationModel(Date date){
		this.date = date;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
