package com.ford.JavaHandsOn;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails= {
				 "john.doe@example.com",
	                "jane123@domain.net",
	                "invalid@email",
	                "short.email@example.co",
	                "too.long.email@domain.org",
	                "no.dot@example"
		};
		
		for(String str:emails) {
			if(Validation(str)) {
				System.out.println(str+" is valid");
			}else {
				System.out.println(str+" is not valid");
			}
		}
		
	}
		private static boolean Validation(String email){
			String[] parts=email.split("@");
			if(parts.length!=2) {
				return false;
			}
			String username =parts[0];
			String extension=parts[1];
			if (username.length() < 8 || username.length() > 14) {
	            return false;
	        }
	        for (char c : username.toCharArray()) {
	            if (!Character.isLetterOrDigit(c)) {
	                return false;
	            }
	        }

	        String[] extensionParts = extension.split("\\."); // Split at the dot
	        if (extensionParts.length != 2) {
	            return false; 
	        }

	        if (extensionParts[0].length() < 2 || extensionParts[1].length() < 2) {
	            return false; 
	        }
	        return true;
		}
		
	}
