package br.com.ivo.awesome.model;

import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	public static List<Student> studentList;
	
	static {
		studentRepository();
	}
	
	
	private static void studentRepository() {
		studentList = new ArrayList<>(asList(new Student("Naruto",1), new Student("Goku",2)));
	}
	
	public Student(String name, int id) {
		this(name);
		this.id	= id;
	}
	
	public Student(String name) {
		this.name = name;
	}

	public Student() {

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static List<Student> getStudentList() {
		return studentList;
	}

	public static void setStudentList(List<Student> studentList) {
		Student.studentList = studentList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
