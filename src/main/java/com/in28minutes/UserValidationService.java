package com.in28minutes;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password){
		if(user.equals("Kekmaster") && password.equals("password")){
			return true;
		}else{
			return false;
		}
		
	}
}
