package com.comparatore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

	public int id;
	public String name;
	public int age;
	public String address;

	public Student(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}

class AgeCompare implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}

}

class NameComparatore implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		return s1.name.compareTo(s2.name);
	}

}

public class Test {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "Azhar Khan", 20, "Sakinaka"));
		list.add(new Student(2, "Aziz Shaikh", 30, "Sakinaka"));
		list.add(new Student(1, "Rehan Khan", 20, "Sakinaka"));
		
		System.out.println("Sorting by name");
		Collections.sort(list,new NameComparatore());
		
		for(Student student1:list) {
			System.out.println(student1);
		}
		
		System.out.println("Sorting by age");
		Collections.sort(list, new AgeCompare());

		for (Student student : list) {
			System.out.println(student);
		}
		
	}

}
