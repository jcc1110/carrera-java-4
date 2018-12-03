package com.models;

public class Client {
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private long phone;
    private double balance;

    public Client(String username, String firstname, String lastname, String email, long phone, double balance) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double isBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    } 
}
