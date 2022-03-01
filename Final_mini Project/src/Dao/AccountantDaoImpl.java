package Dao;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.*;
import java.sql.Connection;

public class AccountantDaoImpl implements AccountantDao{

	Scanner sc = new Scanner(System.in);
	
	public boolean login(String acc_name,String acc_pass,File F1,Connection conn )
	{
		boolean flag = false;
		try {
		String line = "";
		FileReader Fr = new FileReader(F1);
		@SuppressWarnings("resource")
		BufferedReader Br = new BufferedReader(Fr);
		while((line =Br.readLine())!=null) 
		{
			if(line.indexOf(acc_name)!=-1 && line.indexOf(acc_pass)!=-1) {
				flag = true;
		}
			
		}
		}
		catch(IOException e)
		{
			System.out.println("An error Occurred!\n");

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
	public ArrayList<String> showAccountant(File F1,Connection conn)
	{
		 
        String str = "";
        ArrayList <String> At_data = new ArrayList<String>();
		try {
			FileReader Fr = new FileReader(F1);
        @SuppressWarnings("resource")
		BufferedReader Br = new BufferedReader(Fr);
         while((str=Br.readLine())!=null)  
        {  
        		At_data.add(str);
        }
		} catch (IOException e) {
			e.printStackTrace();
		}
        return (At_data);
		
	}
	@Override
	public String addAccountant(Accountant A,File F1,Connection conn) {
		try {
			FileWriter Fw = new FileWriter(F1,true);
			BufferedWriter Bw = new BufferedWriter(Fw);
			
			String s=(A.getAcc_name()+"\t"+A.getAcc_password()+"\t"+A.getAcc_email()+"\t"+A.getAcc_contact()+"\n");
			Bw.write(s);
			Bw.close();
		}
		catch(IOException e)
		{
			System.out.println("An Error Occurred !");
		}
		return ("Accountant " + A.getAcc_name() +"Added Successfully");
	}

}