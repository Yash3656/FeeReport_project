package Dao;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;

public interface AccountantDao {
	public String addAccountant(Accountant A,File F1,Connection conn);
	public  ArrayList<String> showAccountant(File F1,Connection conn);
	public boolean login(String acc_name, String acc_pass, File F1,Connection conn);

}
