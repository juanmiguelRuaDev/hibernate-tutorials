package org.hibernate.tutorial.exercices.hbm;

public class ClientModel extends PersonModel{
	
	private String description;

	
	
	
	
	public ClientModel() {
		super();
	}

	public ClientModel( String dni, String name, String lastName,
			String description) {
		super( dni, name, lastName);
		this.description = description;
	}
	
	
	public ClientModel( String dni, String name, String lastName) {
		super( dni, name, lastName);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
//	public String getDni() {
//		return super.getDni();
//	}
//	public void setDni(String dni) {
//		this.dni = dni;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getLastname() {
//		return lastname;
//	}
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
	
	

}
