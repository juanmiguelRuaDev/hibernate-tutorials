package org.hibernate.tutorial.exercices.hbm;

import java.util.Date;

public class OperationModel {
	
	private int id;
	private Date date;
	private OperationTypeModel operationTypeModel;
	
	
	
	public OperationModel(){
		
	}
	
	public OperationModel(Date date){
		this.date = date;
		
	}
	public OperationModel(Date date, OperationTypeModel om){
		this.date = date;
		this.operationTypeModel = om;
		
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

	public OperationTypeModel getOperationTypeModel() {
		return operationTypeModel;
	}

	public void setOperationTypeModel(OperationTypeModel operationTypeModel) {
		this.operationTypeModel = operationTypeModel;
	}

	
	
	
	
	

}
