package com.day17;

public class Student {
 String name="caiwei";
 int age=110;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}
public Student(String name, int age) {
	super();
	this.name = name;
	this.age = age;
	
}
 
}
