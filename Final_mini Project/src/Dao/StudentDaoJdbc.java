package Dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentDaoJdbc {
	public String updateStudent(Student S1,int rn1,Connection conn);
	public String addStudent(Student S,Connection conn);
	public  ArrayList<String> showStudent(Connection conn) ;
	public String load(int s,Connection conn);
	public ArrayList<String>  due(Connection conn);
	
}



