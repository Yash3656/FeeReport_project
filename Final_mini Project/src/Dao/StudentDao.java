package Dao;

import java.util.List;

public interface StudentDao {
	
	public List<Student> getallStudents();
	public Student getStudent(String rollno);
	public String updateStudent(Student S1);
	public void addstudent(Student S);
	public Student showstudent();
	public Student load();
	public Student  due();
	
}
