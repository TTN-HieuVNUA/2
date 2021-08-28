package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {
	private List<Student> StdList = new ArrayList<Student>();

	public StudentList() {

	}
	public StudentList(List<Student> stdList) {
		super();
		StdList = stdList;
	}
	public List<Student> getStdList() {
		return StdList;
	}
	public void setStdList(List<Student> stdList) {
		StdList = stdList;
	}
	@Override
	public String toString() {
		return "StudentList [StdList=" + StdList + "]";
	}
	
	/// add a new student to list
	public void addNewStd(Student std) {
		this.StdList.add(std);
	}
	
	//  print student list on screen
	
	public void showStdList() {
		for (Student student : StdList) {
			System.out.println(student);
		}
	}
	// check empty
	public boolean checkEmpty() {
		return StdList.isEmpty();
	}
	
	// show quantity of student list
	
	public int quantityStdList() {
		return StdList.size();
	}
	
	// clear list
	
	public void clearList() {
		StdList.clear();
	}
	
	// check student is exists or not by student code
	
	public boolean checkStdByStdCode(Student o) {
		return StdList.contains(o);
	}
	
	// remove a student by student code
	
	public void removeByStdCode(Student std) {
		StdList.remove(std);
	}
	
	// search all student by name
	
	public void showAllStudentByName(String name) {
		for (Student student : StdList) {
			if(student.getName().indexOf(name)>=0) {
				System.out.println(student);
			}
		}
	}
	
	// show student list with low to high age
	
	public void showStdListbyAge() {
		Collections.sort(StdList, new Comparator<Student>() {
			@Override
			public int compare(Student std1, Student std2) {
				if(std1.getAge()<std2.getAge()) {
					return -1;
				}
				else if(std1.getAge()>std2.getAge()) {
					return 1;
				}else {
					return 0;
				}
			}		
		});
	}
	// show student list with high to low age
	
	public void showStdListbyAges() {
		Collections.sort(StdList, new Comparator<Student>() {
			@Override
			public int compare(Student std1, Student std2) {
				if(std1.getAge()<std2.getAge()) {
					return 1;
				}
				else if(std1.getAge()>std2.getAge()) {
					return -1;
				}else {
					return 0;
				}
			}		
		});
	}
}





