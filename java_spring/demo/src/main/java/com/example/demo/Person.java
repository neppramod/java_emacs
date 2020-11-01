package com.example.demo;

public class Person {
    private String name;
    private String title;
    private String role;

    public String getTitle() {
	return title;
    }
    public void setTitle(String title) {
	this.title = title;
    }
    
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    
    public void setRole(String role) {
	this.role = role;
    }
    public String getRole() {
	return this.role;
    }

}
