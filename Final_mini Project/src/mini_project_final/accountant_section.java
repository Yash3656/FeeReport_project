package mini_project_final;
import Dao.*;

import java.util.Scanner;

public class accountant_section {
	Scanner sc1 = new Scanner(System.in);
	public void section_1()
	{
		
		int x;
		do
		{
			Fee_report F1 = new Fee_report();
			admin ad1 = new admin();
			admin_section ads1 =new admin_section();
			accountnat ac1 = new accountnat();
			accountant_section acs1 =new accountant_section();
			StudentDao S1 = new StudentDaoImpl();
			Student S=new Student();
			System.out.println("1.Add Student " + "\n" + "2.View Student" + "\n" + "3.Edit Student" +"\n" +"4.Due Fee" + "\n" + "5.Logout" );
			System.out.println("Enter ur choice:-- ");
			
			int ch = sc1.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Roll_No of the Student should start with RN:-- ");
				S.setRollNo(sc1.nextLine());
				System.out.println("Enter the Name of the Student:--");
				S.setName(sc1.nextLine());
				System.out.println("Enter the  Course Enrolled of the Student:-- ");
				S.setCourse(sc1.nextLine());
				System.out.println("Enter the Email-Id of the Student:-- ");
				S.setEmail_Id(sc1.nextLine());
				System.out.println("Enter the Fees of the Student:-- ");
				S.setFees(sc1.nextLine());
				System.out.println("Enter the Paid Fees of the Student:-- ");
				S.setPaid_fees(sc1.nextLine());
				System.out.println("Enter the Due Fees of the Student:-- ");
				S.setDue_fees(sc1.nextLine());
				System.out.println("Enter the Address of the Student:-- ");
				S.setAddress(sc1.nextLine());
				System.out.println("Enter the City of the Student:-- ");
				S.setCity(sc1.nextLine());
				System.out.println("Enter the State of the Student:-- ");
				S.setState(sc1.nextLine());
				System.out.println("Enter the Country of the Student:-- ");
				S.setCountry(sc1.nextLine());
				System.out.println("Enter the Contact-No of the Accountant:-- ");
				S.setContact_No(sc1.nextLine());
				S1.addstudent(S);
				break;
				
			case 2:
				S1.showstudent();
				break;
			
			case 3:
				String a =S1.updateStudent(S);
				System.out.println(a);
				break;
				
			case 4:
				S1.due();
				break;
				
			case 5:
				F1.original(ad1,ads1,ac1,acs1);
				break;
				
			
			default:
				System.out.println("Please provide valid input:");
				
			}
			System.out.println("\nDo u want to continue:- Press 1");
			x = sc1.nextInt();
		}
		while(x==1);
		
	}




public void due_fee()
{
	
	
}


}

