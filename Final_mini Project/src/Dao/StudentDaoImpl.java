package Dao;

import java.awt.Desktop;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao{
	List<Student> students;

	   @SuppressWarnings("unused")
	public StudentDaoImpl(){
	      students = new ArrayList<Student>();
	      Student S1 = new Student();
	   }

	@Override
	public List<Student> getallStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getStudent(String rollno) {
		// TODO Auto-generated method stub
		Student S2 = new Student();
		return S2;
	}
	public Student due()
	{
		Student S = new Student();
		File sf = new File("C:/Learning_java/FileIO/Student_data.txt");
		
		try {
			FileReader fr = new FileReader(sf);
			FileWriter fw = new FileWriter(sf,true);
			BufferedReader br=new BufferedReader(fr);
	        BufferedWriter bw=new BufferedWriter(fw);
	        String s="";
	        while((s=br.readLine())!=null)        
	    		if(S.getDue_fees()!=null)
	    		{
	    			System.out.println(s);
	    		}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return S;
		
		
	}

	@Override
	public  String showstudent() throws IOException
	{
		File sf = new File("C:/Learning_java/FileIO/Student_data.txt");
        FileReader fr = new FileReader(sf);
        FileWriter fw = new FileWriter(sf,true);

        // FileReader will open that file 
        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw); 
        String str = "";
        while((str=br.readLine())!=null)  
        {  
        	
        		System.out.print(str +"/t");
        }
        return "Students Data Shown";
		/*	try {
				File file2 = new File("C:/Learning_java/FileIO/Student_data.txt");
				Desktop desk = Desktop.getDesktop();
				if(file2.exists())
				desk.open(file2);	
			}
			catch(IOException e)
			{
			e.printStackTrace();
		}
		*/
	}

	@Override
	public String updateStudent(Student S) {
		// TODO Auto-generated method stub
		addstudent(S);
		return ("The Student Data is Updated");
		
	}
	
	
	@Override
	public void addstudent(Student S)
	{
		//Student S = new Student();
		//Scanner sc1 = new Scanner(System.in);
		
		try {
			
			File sf=new File("C:/Learning_java/FileIO/Student_data.txt");
			FileWriter Fw = new FileWriter(sf,true);
			BufferedWriter bw=new BufferedWriter(Fw);
		
		String f = (S.getRollNo()+"\t"+S.getName()+"\t"+S.getCourse()+"\t"+S.getEmail_Id()
					+"\t"+S.getFees()+"\t"+S.getPaid_fees()+"\t"+S.getDue_fees()+"\t"+S.getAddress()
					+"\t"+S.getCity()+"\t"+S.getState()+"\t"+S.getCountry()+"\t"+S.getCountry()+"\t"+S.getContact_No()+"\n");
	
				
			bw.write(f);
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("An Error Occurred !");
		}
	}
	
	@Override
	public String load(String s)
	{
		 String str2="";
		try {
			  
           /// Creating a FileReader object and
            File sf = new File("C:/Learning_java/FileIO/Student_data.txt");
       //     File temp = new File("C:/Learning_java/FileIO/tempfile.txt");
            FileReader fr = new FileReader(sf);
     //       FileWriter fw = new FileWriter(sf,true);
  
            // FileReader will open that file 
            @SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(fr);
           // BufferedWriter bw=new BufferedWriter(fw); 
          //  Scanner sc=new Scanner(System.in);
            String str = "";
           
            //String str3="";
            while((str=br.readLine())!=null)  
            {  
            	if(str.indexOf(s)!=-1)
            	{
            		System.out.print(str);
            	}
            }
            System.out.println();
    	
            while((str=br.readLine())!=null)  
            {  
            	if(str.indexOf(s)!=-1)
            	{
            		str2=str2.concat(str);
            	}
            }
         /*   while((str3=br.readLine())!=null)  
            {
            	String tl = str3.trim();
            	if(tl.equals(str2))
            		continue;
            	bw.write(str3+System.getProperty("line.separator"));
            }
            bw.close();
            br.close();
            boolean successful = temp.renameTo(sf);
		}*/
		}
            catch(Exception e) {
            	System.out.println("Record not found");
            }
            	
            
		return str2;
	}
}

