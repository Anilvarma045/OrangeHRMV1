package com.sdet;

import java.util.ResourceBundle;

public class App {
public int userLogin(String in_user, String in_psw) {
	
	ResourceBundle rb=ResourceBundle.getBundle("config");   //its read data from resource
	String userName=rb.getString("username");   //getString read variable value with variable
	String password=rb.getString("password");
	
	if(in_user.equals(userName)  && in_psw.equals(password))
		return 1;
	else
		return 0;
	
}

}
