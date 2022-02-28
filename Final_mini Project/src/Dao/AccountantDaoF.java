package Dao;

import java.io.File;
import java.util.ArrayList;

public interface AccountantDaoF {
	public String addAccountant(Accountant A,File F1);
	public  ArrayList<String> showAccountant(File F1);
	public boolean login(String acc_name, String acc_pass, File F1);

}
