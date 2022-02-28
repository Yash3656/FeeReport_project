package Dao;

import java.sql.*;
import java.util.*;

public class StudentDaoImplJdbc implements StudentDaoJdbc{

	
	@Override
	public String addStudent(Student S,Connection conn) {
		long flag=0;
		String add = ("insert into student values('"
				+S.getRollNo()+"','"+S.getName()+"','"+S.getFees()+"','"+S.getPaid_fees()+"','"+S.getDue_fees()+"','"
				+S.getCourse()+"','"+S.getEmail_Id()+"','"+S.getAddress()+"','"+S.getCity()+"','"+S.getState()+"','"+S.getCountry()+"','"+S.getContact_No()+"')");
			try{
				Statement s = conn.createStatement();
				flag =s.executeLargeUpdate(add);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			if(flag>0)
				return ("Student Added Su3"
						+ "2.ccessfully");
			else
				return null;
	}
	@Override
	public ArrayList<String> showStudent(Connection conn) {
		String show = "select * from student";
		ArrayList <String> l = new ArrayList<String>();
		try {
			Statement st1 = conn.createStatement();
			ResultSet rs = st1.executeQuery(show);
			int i;
			while(rs.next())
			{
				i=1;
				while(i<13)
				{
	             l.add(rs.getString(i));
	             i++;
				}
	             l.add("\n");
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public String load(int roll_no,Connection conn) {
		String a = "select * from student where roll_no="+roll_no;
		String l="";
		try {
			Statement st1 = conn.createStatement();
			ResultSet rs = st1.executeQuery(a);
			int i=2;
			while(rs.next())
			{
				while(i<13)
				{
	             l=l.concat(rs.getString(i));
	             l=l.concat("\t");
	             i++;
				}

			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return l;
	}

	@SuppressWarnings("resource")
	@Override
	public String updateStudent(Student S1,int rn1,Connection conn) {
		Scanner sc = new Scanner(System.in);
		int flag=0;
		try {
		int x;
		do {
			System.out.println("Enter the Field u want to Update");
			System.out.println("1.Name\n2.Course\n3.Email_id\n4.Fees\n5.Paid_Fees\n6.Due_Fees\n7.Address\n8.City\n9.State\n10.Country\n11.Contact_no\n");
			int n =sc.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Enter the New-Name");
				String new_name = sc.next();
				PreparedStatement st1 = conn.prepareStatement("update student set name=? where roll_no=?");
				st1.setString(1,new_name);
				st1.setInt(2,rn1);
				st1.executeUpdate();
				flag=1;
				break;
				
			case 2:
				System.out.println("Enter the New-Course ");
				String new_course = sc.next();
				PreparedStatement st2 = conn.prepareStatement("update student set course=? where roll_no=?");
				st2.setString(1,new_course);
				st2.setInt(2,rn1);
				st2.executeUpdate();
				flag=1;
				break;
				
			case 3:
				System.out.println("Enter the New-Email_id");
				String new_email = sc.next();
				PreparedStatement st3 = conn.prepareStatement("update student set email_id=? where roll_no=?");
				st3.setString(1,new_email);
				st3.setInt(2,rn1);
				st3.executeUpdate();
				flag=1;
				break;
				
			case 4:
				System.out.println("Enter the New-Fees");
				int new_fees = sc.nextInt();
				PreparedStatement st4 = conn.prepareStatement("update student set fees=? where roll_no=?");
				st4.setInt(1,new_fees);
				st4.setInt(2,rn1);
				st4.executeUpdate();
				flag=1;
				break;
				
			case 5:
				System.out.println("Enter the New-Paid_fees");
				int new_paid = sc.nextInt();
				PreparedStatement st5 = conn.prepareStatement("update student set paid_fees=? where roll_no=?");
				st5.setInt(1,new_paid);
				st5.setInt(2,rn1);
				st5.executeUpdate();
				flag=1;
				break;
				
			case 6:
				System.out.println("Enter the New-Due_fees");
				int new_due = sc.nextInt();
				PreparedStatement st6 = conn.prepareStatement("update student set due_fees=? where roll_no=?");
				st6.setInt(1,new_due);
				st6.setInt(2,rn1);
				st6.executeUpdate();
				flag=1;
				break;
				
			case 7:
				System.out.println("Enter the New-Address");
				String new_address = sc.next();
				PreparedStatement st7 = conn.prepareStatement("update student set address=? where roll_no=?");
				st7.setString(1,new_address);
				st7.setInt(2,rn1);
				st7.executeUpdate();
				flag=1;
				break;
				
			case 8:
				System.out.println("Enter the New-City");
				String new_city = sc.next();
				PreparedStatement st8 = conn.prepareStatement("update student set city=? where roll_no=?");
				st8.setString(1,new_city);
				st8.setInt(2,rn1);
				st8.executeUpdate();
				flag=1;
				break;
				
			case 9:
				System.out.println("Enter the New-State");
				String new_state = sc.next();
				PreparedStatement st9 = conn.prepareStatement("update student set state=? where roll_no=?");
				st9.setString(1,new_state);
				st9.setInt(2,rn1);
				st9.executeUpdate();
				flag=1;
				break;
				
			case 10:
				System.out.println("Enter the New-Country");
				String new_country = sc.next();
			    PreparedStatement st10 = conn.prepareStatement("update student set country=? where roll_no=?");
			    st10.setString(1,new_country);
			    st10.setInt(2,rn1);
			    st10.executeUpdate();
			    flag=1;
			    break;
			   
			case 11:
				System.out.println("Enter the New-COntact_no");
				String new_contact = sc.next();
			    PreparedStatement st11 = conn.prepareStatement("update student set contact_no=? where roll_no=?");
			    st11.setString(1,new_contact);
			    st11.setInt(2,rn1);
			    st11.executeUpdate();
			    flag=1;
			    break;
			    
			default:
				System.out.println("Enter Valid Choice");
			}
			System.out.println("Press 1 to continue");
			x=sc.nextInt();
		}while(x==1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag==1)
			return ("Student with roll_no " +rn1+" is updated successfully");
		else
			return null;
	}

	@Override
	public ArrayList<String> due(Connection conn) {
		String acc_d = "select * from student where due_fees !=0";
		ArrayList <String> l = new ArrayList<String>();
		try {
			Statement st1 = conn.createStatement();
			ResultSet rs = st1.executeQuery(acc_d);
			int i;
			while(rs.next())
			{
				i=1;
				while(i<13)
				{
	             l.add(rs.getString(i));
	             i++;
				}
	            l.add("\n");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}

}
