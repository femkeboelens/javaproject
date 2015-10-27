package data;

import model.Student;

import java.util.Collection;
import java.util.HashSet;

public class Students {
	private Collection<Student> students = new HashSet<Student>();
	public void addStudent(Student s) {
		students.add(s);
	}
	public void fillDatabase() {
		addStudent(new Student("Onis", "Ramon", ""));
	}
}
