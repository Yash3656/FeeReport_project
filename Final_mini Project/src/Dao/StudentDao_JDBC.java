package Dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDao_JDBC {
	public String updateStudent(Student S1,int rn1,Connection conn);
	public String addstudent(Student S,Connection conn);
	public  ArrayList<String> showstudent(Connection conn) ;
	public String load(int s,Connection conn);
	public ArrayList<String>  due(Connection conn);
	
}



