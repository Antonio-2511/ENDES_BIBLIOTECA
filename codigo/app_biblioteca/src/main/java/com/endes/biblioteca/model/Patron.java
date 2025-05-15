package com.endes.biblioteca.model;

public class Patron {
	
	private String name;    
    private String address;  

    // Constructor
    public Patron(String name, String address) {
        this.name = name;
        this.address = address;
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


}
