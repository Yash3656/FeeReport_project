package mini_project_final;
import Dao.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Fee_report
{
	 static Scanner sc = new Scanner(System.in);
	int a,z;
	public void original(Admin Ad,Accountant A,AccountantDaoImpl A1,Student S,StudentDao S1,File F1,File F2)
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
				boolean x1= Ad.login(adm_name, adm_pass);
				if(x1)
				{
					System.out.println("\nLogin Successful!\n");
					int x;
					do {
					System.out.println("1.Add Accountant " + "\n" + "2.View Accountant" + "\n" + "3.Logout" +"\n"+"4.Exit" );
					System.out.println("Enter ur choice:-- ");
					
					int ch = sc.nextInt();
					switch(ch)
					{
					case 1:
						
						System.out.println("Enter the Name of the Accountant:-- ");
						sc.nextLine();
						A.setAcc_name(sc.nextLine());
						System.out.println("Enter the Password of the Accountant:-- ");
						A.setAcc_password(sc.nextLine());
						System.out.println("Enter the Email-Id of the Accountant:-- ");
						A.setAcc_email(sc.nextLine());
						System.out.println("Enter the Contact-No of the Accountant:-- ");
						A.setAcc_contact(sc.nextLine());
						A1.addAccountant(A, F1);
						break;
						
					case 2:
						ArrayList <String> l  = A1.showAccountant(F1);
						System.out.println(l);
						
						break;
						
					case 3:
						original(Ad,A,A1,S,S1,F1,F2);
						break;
						
					case 4:
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
					original(Ad,A,A1,S,S1,F1,F2);
				}
				break;
				
			case 2:
				System.out.println("Enter the Accounant name :--");
				String acc_name = sc.next();
				System.out.println("Enter the Accountant Password :--");
				String acc_pass = sc.next();
				boolean y= A1.login_1(acc_name,acc_pass, F1);
				if(y)
				{
					System.out.println("\n Accountant Login Successful!\n");
					int x;
					do {
					System.out.println("1.Add Student " + "\n" + "2.View Student" + "\n" + "3.Edit Student" +"\n" +"4.Due Fee" + "\n" + "5.Logout" );
					System.out.println("Enter ur choice:-- ");
					
					int ch = sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter the Roll_No of the Student should start with RN:-- ");
						sc.nextLine();
						S.setRollNo(sc.nextLine());
						System.out.println("Enter the Name of the Student:--");
						S.setName(sc.nextLine());
						System.out.println("Enter the  Course Enrolled of the Student:-- ");
						S.setCourse(sc.nextLine());
						System.out.println("Enter the Email-Id of the Student:-- ");
						S.setEmail_Id(sc.nextLine());
						System.out.println("Enter the Fees of the Student:-- ");
						S.setFees(sc.nextLine());
						System.out.println("Enter the Paid Fees of the Student:-- ");
						S.setPaid_fees(sc.nextLine());
						System.out.println("Enter the Due Fees of the Student:-- ");
						S.setDue_fees(sc.nextLine());
						System.out.println("Enter the Address of the Student:-- ");
						S.setAddress(sc.nextLine());
						System.out.println("Enter the City of the Student:-- ");
						S.setCity(sc.nextLine());
						System.out.println("Enter the State of the Student:-- ");
						S.setState(sc.nextLine());
						System.out.println("Enter the Country of the Student:-- ");
						S.setCountry(sc.nextLine());
						System.out.println("Enter the Contact-No of the Accountant:-- ");
						S.setContact_No(sc.nextLine());
						S1.addstudent(S,F2);
						break;
						
					case 2:
							ArrayList <String> l1  =S1.showstudent(F2);
							System.out.println(l1);
						break;
					
					case 3:
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the roll number u want to load info for:--");
						String rn =sc.nextLine();
						String b =S1.load(rn,F2);
						System.out.println(b);
						String a =S1.updateStudent(S,b,F2);
						System.out.println(a);
						break;
						
					case 4:
						ArrayList <String> l2  =S1.due(S,F2);
						System.out.println(l2);
						break;
						
					case 5:
						original(Ad,A,A1,S,S1,F1,F2);
						break;
						
					case 6:
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
					original(Ad,A,A1,S,S1,F1,F2);
				}
				break;
				
			case 3:
				System.exit(0);
				
				default:
					System.out.println("Invalid Choice");
			
			}
		}while(a==1);
	}
	public static void main(String[] args) 
	{
		File F1 = new File("C:/Learning_java/FileIO/Accountant_data.txt");
		File F2 = new File("C:/Learning_java/FileIO/Student_data.txt");
		Fee_report F = new Fee_report();
		Admin Ad = new Admin();
		Accountant A = new Accountant();
		AccountantDaoImpl A1 =  new AccountantDaoImpl();
		Student S = new Student();
		StudentDao S1 = new StudentDaoImpl();
		F.original(Ad,A,A1,S,S1,F1,F2);
		
	}
	
}