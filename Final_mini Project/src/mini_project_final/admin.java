package mini_project_final;

public class admin {
	String admin_name = "YashAgrawal";
	String admin_pass = "Yash@123";
	
	
	
	boolean login(String name , String pass)
	{
		if(name.equals(admin_name) && pass.equals(admin_pass))
		{
			System.out.println("Login Successful!\n");
			return true;
		}
		else
		{
			System.out.println("Invalid name or password\n");
			return false;
		}
	}
	
	
	

}
