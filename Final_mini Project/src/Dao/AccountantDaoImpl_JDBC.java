package Dao;

import java.io.*;
import java.sql.*;
import java.util.*;

public class AccountantDaoImpl_JDBC implements AccountantDao_JDBC {
Scanner sc = new Scanner(System.in);
	
	@Override
	public boolean login_1(String acc_name,String acc_pass,Connection conn)
	{
		boolean flag = false;
		try {
		String s =("select name,password from accountant where name=" +acc_name + "and password="+acc_pass+"");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(s);
		if(rs.next())
		{
			flag=true;
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
}
		@Override
	public String addAccountant(Accountant A,Connection conn) {
		String acc = ("insert into accountant values('"+A.getAcc_name()+"','"+A.getAcc_password()+
					"','"+A.getAcc_email()+"','"+A.getAcc_contact()+"','"+A.getAcc_id()+"')");
		int a=0;
		try{
			Statement st = conn.createStatement();
			a =st.executeUpdate(acc);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(a>0)
			return ("Accountant Added Successfully");
		else
			return null;
	}
		@Override
		public ArrayList<String> showAccountant(Connection conn)
		{
	        ArrayList <String> At_data = new ArrayList<String>(); 
	        String acc_s = "Select * from Accountant";
	        try {
	        	Statement st = conn.createStatement();
	        	ResultSet rs = st.executeQuery(acc_s);
	        	int i=1;
	        	int j=0;
	        	while(rs.next())
	        	{
	        		while(i<6)
	        		{
	        			At_data.add(rs.getString(i));
	        			i++;
	        		}
	        		if(j!=0)
	        			At_data.add("\n");
	        		j=1;
	        	}
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	        
	        return (At_data);
			
		}


}
