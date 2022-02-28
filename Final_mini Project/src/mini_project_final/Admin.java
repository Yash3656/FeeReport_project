package mini_project_final;

public class Admin {
	String admin_name = "YashAgrawal";
	String admin_pass = "Yash@123";
	
	boolean login(String adm_name , String adm_pass)
	{
		if(adm_name.equals(admin_name) && adm_pass.equals(admin_pass))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	

}
