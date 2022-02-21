package mini_project_final;

import java.util.Scanner;
import java.awt.Desktop;
import java.io.*;

public class admin_section {

	Scanner sc1 = new Scanner(System.in);
	public void section()
	{
		
		int x;
		do
		{
			Fee_report F1 = new Fee_report();
			admin ad1 = new admin();
			admin_section ads1 =new admin_section();
			accountnat ac1 = new accountnat();
			accountant_section acs1 =new accountant_section();
			System.out.println("1.Add Accountant " + "\n" + "2.View Accountant" + "\n" + "3.Logout" );
			System.out.println("Enter ur choice:-- ");
			
			int ch = sc1.nextInt();
			switch(ch)
			{
			case 1:
				add_acc();
				break;
				
			case 2:
				view_acc();
				break;
				
			case 3:
				F1.original(ad1,ads1,ac1,acs1);
				break;
				
			default:
				System.out.println("Please provide valid input:");
				
			}
			System.out.println("Do u want to continue:- Press 1");
			x = sc1.nextInt();
		}
		while(x==1);
		
	}
		
	String acc_name,acc_password,acc_email,acc_contact;
	public void getdetails()
	{
		System.out.println("Enter the Name of the Accountant:-- ");
		sc1.nextLine();
		acc_name = sc1.nextLine();
		System.out.println("Enter the Password of the Accountant:-- ");
		acc_password = sc1.nextLine();
		System.out.println("Enter the Email-Id of the Accountant:-- ");
		acc_email = sc1.nextLine();
		System.out.println("Enter the Contact-No of the Accountant:-- ");
		acc_contact = sc1.nextLine();
	}
	public void add_acc()
	{		
		getdetails();
		try {
			File add = new File("C:/Learning_java/FileIO/Accountant_data.txt");
			FileWriter Fw = new FileWriter(add,true);
			BufferedWriter br = new BufferedWriter(Fw);
			
			String s=(acc_name+"\t"+acc_password+"\t"+acc_email+"\t"+acc_contact+"\n");
			br.write(s);
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("An Error Occurred !");
		}
	}
	
	public void view_acc()
	{
		try {
			File file = new File("C:/Learning_java/FileIO/Accountant_data.txt");
			Desktop desk = Desktop.getDesktop();
			if(file.exists())
			desk.open(file);		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
