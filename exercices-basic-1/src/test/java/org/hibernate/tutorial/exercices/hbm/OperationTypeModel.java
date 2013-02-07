package org.hibernate.tutorial.exercices.hbm;

public class OperationTypeModel {
	
	private int idOperationType;
	private String description;
	
	
	public OperationTypeModel(String description) {
		this.description = description;
	}	
	
	public OperationTypeModel() {
		
	}
	
	public int getIdOperationType() {
		return idOperationType;
	}
	public void setIdOperationType(int idOperationType) {
		this.idOperationType = idOperationType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
