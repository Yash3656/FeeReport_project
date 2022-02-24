package Dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface StudentDao {
	
	public String updateStudent(Student S1,String b,File F2);
	public void addstudent(Student S,File F2);
	public  ArrayList<String> showstudent(File F2);
	public String load(String s,File F2);
	public ArrayList<String>  due(Student S,File F2);
	
}
