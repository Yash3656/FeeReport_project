package Dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public interface AccountantDao {
	public String addAccountant(Accountant A,File F1);
	public  ArrayList<String> showAccountant(File F1);

}
