package Dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface StudentDao {
	
	public List<Student> getallStudents();
	public Student getStudent(String rollno);
	public String updateStudent(Student S1);
	public void addstudent(Student S);
	public  String showstudent() throws  IOException;
	public String load(String s);
	public Student  due();
	
}
