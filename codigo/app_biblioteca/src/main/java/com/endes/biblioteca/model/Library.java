package com.endes.biblioteca.model;

public class Library {
	
	private String name;     
    private String address;  

    // Constructor
    public Library(String name, String address) {
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
