package mini_project_final;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class accountnat {

	boolean login_1()
	{
		boolean flag = false;
		try {
		Scanner sc2 = new Scanner(System.in);
		
		
		String word,pass4;
		System.out.println("Enter the Accountant name :--");
		word = sc2.next();
		System.out.println("Enter the Password :--");
		pass4 = sc2.next();
		String line = "";
		FileReader F1 = new FileReader("C:/Learning_java/FileIO/Accountant_data.txt");
		BufferedReader br = new BufferedReader(F1);
		while((line =br.readLine())!=null) 
		{
			if(line.indexOf(word)!=-1 && line.indexOf(pass4)!=-1) {
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
			System.out.println("\nLogin Successful!\n");
			return true;
		}
		else
		{
			System.out.println("\nInvalid name or password\n");
			return false;
		}
}
}