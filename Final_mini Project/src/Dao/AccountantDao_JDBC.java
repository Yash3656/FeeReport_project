package Dao;

import java.sql.Connection;
import java.util.ArrayList;

public interface AccountantDao_JDBC {
		public boolean login_1(String acc_name,String acc_pass,Connection conn);
		public String addAccountant(Accountant A,Connection conn);
		public  ArrayList<String> showAccountant(Connection conn);

	}



