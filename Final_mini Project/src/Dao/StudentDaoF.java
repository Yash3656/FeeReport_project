package Dao;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;

public interface StudentDaoF {
	
	public String updateStudent(Student S1,String b,int rn,File F2,Connection conn);
	public String addStudent(Student S,File F2,Connection conn);
	public  ArrayList<String> showStudent(File F2,Connection conn);
	public String load(int s,File F2,Connection conn);
	public ArrayList<String>  due(Student S,File F2,Connection conn);
	
}
