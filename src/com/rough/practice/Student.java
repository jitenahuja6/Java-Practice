package com.rough.practice;

public class Student {
	
	private int studentid;
	private String name;
	private String address;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
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
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
