package mini_project_final;
import Dao.*;

import java.io.*;
import java.util.Scanner;

public class Fee_report
{
	 static Scanner sc = new Scanner(System.in);
	int a,z;
	public void original(admin ad1,admin_section ads1,accountnat ac1,accountant_section acs1)
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
				String name = sc.next();
				System.out.println("Enter the Password :--");
				String pass = sc.next();
				boolean x= ad1.login(name, pass);
				if(x)
				{
					ads1.section();
					
				}
				else
				{
					original(ad1,ads1,ac1,acs1);
				}
				break;
				
			case 2:
				boolean y= ac1.login_1();
				if(y)
				{
					acs1.section_1();
					
				}
				else
				{
					original(ad1,ads1,ac1,acs1);
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
		admin ad = new admin();
		Fee_report F = new Fee_report();
		admin_section ads = new admin_section();
		accountnat ac = new accountnat();
		Student S = new Student();
		accountant_section acs = new accountant_section();
		F.original(ad,ads,ac,acs);
		
		
	}
	
}