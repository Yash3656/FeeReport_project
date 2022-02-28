package Dao;

import java.sql.Connection;
import java.util.ArrayList;

public interface AccountantDaoJdbc {
		public boolean login(String acc_name,String acc_pass,Connection conn);
		public String addAccountant(Accountant A,Connection conn);
		public  ArrayList<String> showAccountant(Connection conn);

	}



