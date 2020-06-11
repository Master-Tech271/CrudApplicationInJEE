package com.umar.crud;

public class Members{
	private int id;
	private String username;
	private String type;
	public Members(int id, String username, String type) {
		this.id = id;
		this.username = username;
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getType() {
		return type;
	}
}