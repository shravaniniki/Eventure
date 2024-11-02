package Java8.Lamba;

interface YahooDomain{
	public boolean isYahooMail(String email);
}

public class LambdaDemo2 {
	public static void checkYahooMails(String emails[],YahooDomain yahooDomain) {
		for(String email:emails) {
			if(yahooDomain.isYahooMail(email)) {
				System.out.println(email + " has yahoo domain");
			}else {
				System.out.println(email+" has no yahoo domain");
			}
		}
		
	}
	public static void main(String[] args) {
	
		String emails[]= {"kiran@yahoo.com","surya@gmail.com","arun@rediff.com","rajan@gmail.com","main@yahoo.com"};
		
	
	YahooDomain check=(email)->{
		
		return email.contains("yahoo") ? true:false;
	};
	checkYahooMails(emails,check);
	}
}
