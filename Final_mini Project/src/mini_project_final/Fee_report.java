package mini_project_final;
import Dao.*;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fee_report
{
	 static Scanner sc = new Scanner(System.in);
	int a,z;
	public void original(Admin Adm,Accountant Accnt,AccountantDao AccntF,AccountantDao AccntD,Student Std,StudentDao StdF,StudentDao StdD,File F1,File F2, Connection conn) throws SQLException
	{
		do
		{ 
			System.out.println("1.Admin Login " + "\n" + "2.Accountant Login" + "\n" + "3.Exit");
			System.out.println("Enter ur Choice:-");
			z=sc.nextInt();
			switch(z)
			{
			case 1:
				System.out.println("Enter the name :--");
				String adm_name = sc.next();
				System.out.println("Enter the Password :--");
				String adm_pass = sc.next();
				boolean x1= Adm.login(adm_name, adm_pass);
				if(x1)
				{
					System.out.println("\nLogin Successful!\n");
					int x;
					do {
					System.out.println("1.Add Accountant " + "\n" + "2.View Accountant" + "\n" + "3.Add Accountant in Database " + "\n" + "4.View Accountant from Database"+" \n"+"5.Logout" +"\n"+"6.Exit" );
					System.out.println("Enter ur choice:-- ");
					
					int ch = sc.nextInt();
					switch(ch)
					{
					case 1:
						
						System.out.println("Enter the Name of the Accountant:-- ");
						sc.nextLine();
						Accnt.setAcc_name(sc.nextLine());
						System.out.println("Enter the Password of the Accountant:-- ");
						Accnt.setAcc_password(sc.nextLine());
						System.out.println("Enter the Email-Id of the Accountant:-- ");
						Accnt.setAcc_email(sc.nextLine());
						System.out.println("Enter the Contact-No of the Accountant:-- ");
						Accnt.setAcc_contact(sc.nextLine());
						AccntF.addAccountant(Accnt, F1,conn);
						break;
						
					case 2:
						ArrayList <String> l  = AccntF.showAccountant(F1,conn);
						System.out.println(l);
						
						break;
						
					case 3:
						
						System.out.println("Enter the Name of the Accountant:-- ");
						sc.nextLine();
						Accnt.setAcc_name(sc.nextLine());
						System.out.println("Enter the Password of the Accountant:-- ");
						Accnt.setAcc_password(sc.nextLine());
						System.out.println("Enter the Email-Id of the Accountant:-- ");
						Accnt.setAcc_email(sc.nextLine());
						System.out.println("Enter the Contact-No of the Accountant:-- ");
						Accnt.setAcc_contact(sc.nextLine());
						System.out.println("Enter the Id of the Accountant:-- ");
						Accnt.setAcc_id(sc.nextLine());
						String z=AccntD.addAccountant(Accnt,F1, conn);
						System.out.println(z);
						break;
						
					case 4:
						ArrayList <String> l2  = AccntD.showAccountant(F1,conn);
						System.out.println(l2);
						
						break;	
					case 5:
						original(Adm,Accnt,AccntF,AccntD,Std,StdF,StdD,F1,F2,conn);
						break;
						
					case 6:
						System.exit(0);
						
					default:
						System.out.println("Please provide valid input:");
						
					}
					System.out.println("Do u want to continue:- Press 1");
					x = sc.nextInt();
				}
				while(x==1);
					
				}
				else
				{
					System.out.println("\nInvalid name or password\n");
					original(Adm,Accnt,AccntF,AccntD,Std,StdF,StdD,F1,F2,conn);
				}
				break;
				
			case 2:
				System.out.println("Enter the Accounant name :--");
				String acc_name = sc.next();
				System.out.println("Enter the Accountant Password :--");
				String acc_pass = sc.next();
				boolean y= AccntF.login(acc_name,acc_pass, F1,conn);
				if(y)
				{
					System.out.println("\n Accountant Login Successful!\n");
					int x;
					do {
					System.out.println("1.Add Student " + "\n" + "2.View Student" + "\n" + "3.Edit Student" +"\n" +"4.Due Fee" +
							"\n"+ "5.Add Student in Database" + "\n" + "6.View Student from Database" + "\n" + "7.Edit Student"
									+ " in Database" +"\n" +"8.Due Fee in Database" + "\n" + "9.Logout" + "\n" + "10.Exit" );
					System.out.println("Enter ur choice:-- ");
					
					int ch = sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter the Roll_No of the Student :-- ");
						sc.nextLine();
						Std.setRollNo(sc.nextLine());
						System.out.println("Enter the Name of the Student:--");
						Std.setName(sc.nextLine());
						System.out.println("Enter the Fees of the Student:-- ");
						Std.setFees(sc.nextLine());
						System.out.println("Enter the Paid Fees of the Student:-- ");
						Std.setPaid_fees(sc.nextLine());
						System.out.println("Enter the Due Fees of the Student should start with Due:-- ");
						Std.setDue_fees(sc.nextLine());
						System.out.println("Enter the  Course Enrolled of the Student:-- ");
						Std.setCourse(sc.nextLine());
						System.out.println("Enter the Email-Id of the Student:-- ");
						Std.setEmail_Id(sc.nextLine());
						System.out.println("Enter the Address of the Student:-- ");
						Std.setAddress(sc.nextLine());
						System.out.println("Enter the City of the Student:-- ");
						Std.setCity(sc.nextLine());
						System.out.println("Enter the State of the Student:-- ");
						Std.setState(sc.nextLine());
						System.out.println("Enter the Country of the Student:-- ");
						Std.setCountry(sc.nextLine());
						System.out.println("Enter the Contact-No of the Accountant:-- ");
						Std.setContact_No(sc.nextLine());
						String addF =StdF.addStudent(Std,F2,conn);
						System.out.println(addF);
						break;
						
					case 2:
							ArrayList <String> l1  =StdF.showStudent(F2,conn);
							System.out.println(l1);
						break;
					
					case 3:
						System.out.println("Enter the roll number u want to load info for:--");
						int rn =sc.nextInt();
						String b =StdF.load(rn,F2,conn);
						System.out.println(b);
						String a =StdF.updateStudent(Std,b,rn,F2,conn);
						System.out.println(a);
						break;
						
					case 4:
						ArrayList <String> l2  =StdF.due(Std,F2,conn);
						System.out.println(l2);
						break;
						
					case 5:
						System.out.println("Enter the Roll_No of the Student :-- ");
						Std.setRollNo(sc.next());
						System.out.println("Enter the Name of the Student:--");
						Std.setName(sc.next());
						System.out.println("Enter the  Course Enrolled of the Student:-- ");
						Std.setCourse(sc.next());
						System.out.println("Enter the Email-Id of the Student:-- ");
						Std.setEmail_Id(sc.next());
						System.out.println("Enter the Fees of the Student:-- ");
						Std.setFees(sc.next());
						System.out.println("Enter the Paid Fees of the Student:-- ");
						Std.setPaid_fees(sc.next());
						System.out.println("Enter the Due Fees of the Student:-- ");
						Std.setDue_fees(sc.next());
						System.out.println("Enter the Address of the Student:-- ");
						Std.setAddress(sc.next());
						System.out.println("Enter the City of the Student:-- ");
						Std.setCity(sc.next());
						System.out.println("Enter the State of the Student:-- ");
						Std.setState(sc.next());
						System.out.println("Enter the Country of the Student:-- ");
						Std.setCountry(sc.next());
						System.out.println("Enter the Contact-No of the Accountant:-- ");
						Std.setContact_No(sc.next());
						String res =StdD.addStudent(Std,F2,conn);
						System.out.println(res);
						break;
						
					case 6:
							ArrayList <String> l4  =StdD.showStudent(F2,conn);
							System.out.println(l4);
						break;
					
					case 7:
						System.out.println("Enter the roll number u want to load info for:--");
						int rn1 =sc.nextInt();
						String b1 =StdD.load(rn1,F2,conn);
						System.out.println(b1);
						String a1 =StdD.updateStudent(Std,b1,rn1,F2,conn);
						System.out.println(a1);
						break;
						
					case 8:
						ArrayList <String> l3  =StdD.due(Std,F2,conn);
						System.out.println(l3);
						break;
						
					case 9:
						original(Adm,Accnt,AccntF,AccntD,Std,StdF,StdD,F1,F2,conn);
						break;
						
					case 10:
						System.exit(0);
					
					default:
						System.out.println("Please provide valid input:");
						
					}
					System.out.println("\nDo u want to continue:- Press 1");
					x = sc.nextInt();
				}
				while(x==1);
				
					
				}
				else
				{
					System.out.println("\nInvalid name or password\n");
					original(Adm,Accnt,AccntF,AccntD,Std,StdF,StdD,F1,F2,conn);
				}
				break;
				
			case 3:
				System.exit(0);
				
				default:
					System.out.println("Invalid Choice");
			
			}
		}while(a==1);
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		String url = "jdbc:mysql://localhost/feereport";
		String user = "root";
		String password ="Yash@123";
	    File F1 = new File("C:/Learning_java/FileIO/Accountant_data.txt");
		File F2 = new File("C:/Learning_java/FileIO/Student_data.txt");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		Fee_report Fee = new Fee_report();
		Admin Adm = new Admin();
		Accountant Accnt = new Accountant();
		AccountantDao AccntF =  new AccountantDaoImpl();
		AccountantDao AccntD =  new AccountantDaoImplJdbc();
		Student Std = new Student();
		StudentDao StdF = new StudentDaoImplF();
		StudentDao StdD = new StudentDaoImplJdbc();
		Fee.original(Adm,Accnt,AccntF,AccntD,Std,StdF,StdD,F1,F2,conn);
	}
	
}