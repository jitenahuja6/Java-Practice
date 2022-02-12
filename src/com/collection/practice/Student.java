package com.collection.practice;

public class Student implements Comparable<Student>
{
	int rollno;  
	String name;  
	int age;  
	
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
		}  
	
	public int compareTo(Student s){  
		if(age==s.age)  
		return 0;  
		else if(age>s.age)  
		return 1;  
		else  
		return -1;  
		}  
		}  


