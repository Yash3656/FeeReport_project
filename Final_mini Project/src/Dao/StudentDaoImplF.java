package Dao;

import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDaoImplF implements StudentDaoF{

	@Override
	public String addStudent(Student S,File F2,Connection conn)
	{
		try {
			FileWriter Fw = new FileWriter(F2,true);
			BufferedWriter Bw=new BufferedWriter(Fw);
		
		String f = (S.getRollNo()+"\t"+S.getName()+"\t"+S.getCourse()+"\t"+S.getEmail_Id()
					+"\t"+S.getFees()+"\t"+S.getPaid_fees()+"\t"+S.getDue_fees()+"\t"+S.getAddress()
					+"\t"+S.getCity()+"\t"+S.getState()+"\t"+S.getCountry()+"\t"+S.getCountry()+"\t"+S.getContact_No()+"\n");
	
			Bw.write(f);
			Bw.close();
		}
		catch(IOException e)
		{
			System.out.println("An Error Occurred !");
		}
		return ("Student Added Successfully");
	}
	
	@Override
	public  ArrayList<String> showStudent(File F2,Connection conn) 
	{
		ArrayList <String> St_data = new ArrayList<String>();
		try {
        FileReader fr = new FileReader(F2); 
        @SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr); 
        String str = "";
        while((str=br.readLine())!=null)  
        {  
        		St_data.add(str);
        }
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
        return (St_data);
		
	}
	@Override
	public String load(int s,File F2,Connection conn)
	{
		String str2="";
		try {
            FileReader fr = new FileReader(F2);
            @SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(fr);
            String str = "";
            while((str=br.readLine())!=null)  
            {  
            	if(str.indexOf(s)!=-1)
            	{
            		str2=str;
            	}
            }
		}
            catch(Exception e) {
            	System.out.println("Record not found");
            }
            	
      return str2;
	}

	@Override
	public String updateStudent(Student S,String b,int rn,File F2,Connection conn) {
		try{
		FileReader fr = new FileReader(F2);
		FileWriter Fw = new FileWriter(F2,true);
		BufferedReader br  = new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(Fw);
		String s ="";
		Scanner sc1 =new Scanner(System.in);
		while((s=br.readLine())!= null)
		{
			if(s.indexOf(b)!=-1)
			{
				String concat1="";
				System.out.println("Enter the Name of the Student:--");
				S.setName(sc1.nextLine());
				concat1 = concat1.concat(S.getName());
				System.out.println("Enter the  Course Enrolled of the Student:-- ");
				S.setCourse(sc1.nextLine());
				concat1 = concat1.concat(S.getCourse());
				System.out.println("Enter the Email-Id of the Student:-- ");
				S.setEmail_Id(sc1.nextLine());
				concat1 = concat1.concat(S.getEmail_Id());
				System.out.println("Enter the Fees of the Student:-- ");
				S.setFees(sc1.nextLine());
				concat1 = concat1.concat(S.getFees());
				System.out.println("Enter the Paid Fees of the Student:-- ");
				S.setPaid_fees(sc1.nextLine());
				concat1 = concat1.concat(S.getPaid_fees());
				System.out.println("Enter the Due Fees of the Student:-- ");
				S.setDue_fees(sc1.nextLine());
				concat1 = concat1.concat(S.getDue_fees());
				System.out.println("Enter the Address of the Student:-- ");
				S.setAddress(sc1.nextLine());
				concat1 = concat1.concat(S.getAddress());
				System.out.println("Enter the City of the Student:-- ");
				S.setCity(sc1.nextLine());
				concat1 = concat1.concat(S.getCity());
				System.out.println("Enter the State of the Student:-- ");
				S.setState(sc1.nextLine());
				concat1 = concat1.concat(S.getState());
				System.out.println("Enter the Country of the Student:-- ");
				S.setCountry(sc1.nextLine());
				concat1 = concat1.concat(S.getCountry());
				System.out.println("Enter the Contact-No of the Accountant:-- ");
				S.setContact_No(sc1.nextLine());
				concat1 = concat1.concat(S.getContact_No());
				s.replaceAll(b,concat1);
			}
		}
		}
		catch(IOException e) {
			
		}
		return ("The Student Data is Updated");
		
	}
    @Override
	public ArrayList<String>  due(Student S,File F2,Connection conn)
	{
    	ArrayList <String> St_due = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(F2);
			FileWriter fw = new FileWriter(F2,true);
			BufferedReader br=new BufferedReader(fr);
	        BufferedWriter bw=new BufferedWriter(fw);
	        String s="";
	        while((s=br.readLine())!=null)        
	        {	if(s.indexOf("Due")!=-1)
	    		{
	    			St_due.add(s);
	    		}
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return St_due;
		
		
	}
	
}

