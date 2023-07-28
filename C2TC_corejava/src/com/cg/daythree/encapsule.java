package com.cg.daythree;

public class encapsule {
	private int id;
	private String name;
	private int age;
	private String gender;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	public static void main(String[]args) {
		encapsule obj1=new encapsule();
		obj1.setName("hariharan");
		obj1.setId(101);
		obj1.setAge(12);
		obj1.setGender("male");
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getGender());
	}
	

}
