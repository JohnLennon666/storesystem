package com.rlue.storesystem.entity;

public class Customer {
    private int id;
    private String name;
    private String company;
    private String address;
    private String email;
    private String phone;

    public Customer() {
    }

    public Customer(int id, String name, String company, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
