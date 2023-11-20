package com.hexaware.springboot5.model;

public class Admin {
	private int adminId;
	private String adminName;
	private int adminAge;
	public Admin() {
		super();
	}
	public Admin(int adminId, String adminName, int adminAge) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminAge = adminAge;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public int getAdminAge() {
		return adminAge;
	}
	public void setAdminAge(int adminAge) {
		this.adminAge = adminAge;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminAge=" + adminAge + "]";
	}
	
	
	

}
