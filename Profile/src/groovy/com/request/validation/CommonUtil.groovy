package com.request.validation

import java.util.regex.Pattern

class CommonUtil {

	public static boolean isPhoneNumberValid(String phone){
				  Pattern pattern = Pattern.compile(".*[^0-9].*");
				 
				 if(phone == null || phone.trim().length() != 10 || pattern.matcher(phone).matches()){
					 return false;
				 }
					return true;
			  }
}
