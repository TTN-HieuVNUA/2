package service;

import java.util.Scanner;

import controller.Student;
import controller.StudentList;

public class main {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		int choose = 0;
		do {
			System.out.println("=============== MENU =====================");
			System.out.println("1. add a new student");
			System.out.println("2. print student list to screen");
			System.out.println("3. check student list is empty?");
			System.out.println("4. show quantity of list");
			System.out.println("5. clear list");
			System.out.println("6. check student by student code");
			System.out.println("7. remove a student by student code");
			System.out.println("8. search student all by student name");
			System.out.println("9. show student list with high to low age");
			System.out.println("0. exit");
			Scanner scanner = new Scanner(System.in);
			choose = scanner.nextInt();
			scanner.nextLine();
			if(choose == 1) {
				System.out.println("student code: ");
					String stdcode = scanner.nextLine();
					System.out.println("student name: ");
					String stdname = scanner.nextLine();
					System.out.println("student Age: ");
					int stdAge = scanner.nextInt(); scanner.nextLine();
					System.out.println("student Address: ");
					String stdAddress = scanner.nextLine();
					Student student = new Student(stdcode, stdname, stdAge, stdAddress);
				studentList.addNewStd(student);
			} 
			
			else if(choose == 2) {
				studentList.showStdList();
			}
			
			else if(choose == 3) {
				System.out.println(studentList.checkEmpty());;
			}
			
			else if(choose == 4) {
				System.out.println("student quantity: "+studentList.quantityStdList());;
			}
			
			else if(choose == 5) {
				studentList.clearList();
			}
			
			else if(choose == 6) {
				System.out.print("enter student code: "); String stdCode = scanner.nextLine();
				Student student = new Student(stdCode);
				System.out.println("checkStdByStdCode: " + studentList.checkStdByStdCode(student));;
			}
			
			else if(choose == 7) {
				System.out.println("enter student code: ");
				String stdCode = scanner.nextLine();
				Student student = new Student(stdCode);
				studentList.removeByStdCode(student);
			}
			
			else if(choose == 8) {
				System.out.println("enter String name: ");
				String StdName = scanner.nextLine();
				studentList.showAllStudentByName(StdName);
			}
			
			else if(choose == 9) {
				studentList.showStdListbyAge();
			}
		}while(choose != 0);
	}
}
