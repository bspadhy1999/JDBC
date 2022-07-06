import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.StudentDao;
import com.student.manage.Student;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to student management app");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit app");
			int c=Integer.parseInt(br.readLine());
			if (c==1) {
				System.out.println("Enter Student name: ");
				String name=br.readLine();
				System.out.println("Enter Student city: ");
				String city=br.readLine();
				System.out.println("Enter Student phone: ");
				String phone=br.readLine();
				Student st=new Student(name, city, phone);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is added sucessfully...");
				}
				else {
					System.out.println("Something went wrong .. try again ..");
				}
				System.out.println(st);
				
			}
			else if (c==2) {
				System.out.println("Enter the student id to delete: ");
				int id=Integer.parseInt(br.readLine());
				boolean answer=StudentDao.deleteStudent(id);
				if(answer) {
					System.out.println("Deleted sucessfully...");
				}
				else {
					System.out.println("Something went wrong .. try again ..");
				}
				
			}
			else if (c==3) {
				StudentDao.showAllStudent();
			} 
			else if(c==4) {
				break;
			}
			else {
				
			}
		}
		System.out.println("Thank you for using my application....");
		System.out.println("See you soon.....bye bye.....");
		
	}

}
