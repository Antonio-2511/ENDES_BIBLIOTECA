package com.endes.biblioteca.model;

public class Librarian {
	
	private String name;    
    private String address;  
    private String position;  

    // Constructor
    public Librarian(String name, String address, String position) {
        this.name = name;
        this.address = address;
        this.position = position;
    }

    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
