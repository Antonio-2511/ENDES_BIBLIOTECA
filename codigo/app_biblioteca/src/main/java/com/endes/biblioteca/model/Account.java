package com.endes.biblioteca.model;

import java.util.Date;
import java.util.List;

public class Account {
	
	private String number; 
    private List<String> history; 
    private Date opened; 
    private AccountState state; 

    // Constructor
    public Account(String number, List<String> history, Date opened, AccountState state) {
        this.number = number;
        this.history = history;
        this.opened = opened;
        this.state = state;
    }

    // Getters y setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public Date getOpened() {
        return opened;
    }

    public void setOpened(Date opened) {
        this.opened = opened;
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }


}
