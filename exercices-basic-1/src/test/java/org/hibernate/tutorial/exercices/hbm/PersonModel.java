package org.hibernate.tutorial.exercices.hbm;

public class PersonModel  {
	
	protected int id;
	protected String dni;
	protected String name;
	protected String lastname;
	protected int personType = 0;
	
	public PersonModel( String dni, String name, String lastname) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.lastname = lastname;
	}
	
	
	public PersonModel() {
		
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
