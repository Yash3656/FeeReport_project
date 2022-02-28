package Dao;

import java.io.File;
import java.util.ArrayList;

public interface StudentDaoF {
	
	public String updateStudent(Student S1,String b,File F2);
	public String addStudent(Student S,File F2);
	public  ArrayList<String> showStudent(File F2);
	public String load(String s,File F2);
	public ArrayList<String>  due(Student S,File F2);
	
}
