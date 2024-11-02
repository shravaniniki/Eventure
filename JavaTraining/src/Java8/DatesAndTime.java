package Java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DatesAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date1=LocalDate.of(2024, 3, 4);
		LocalDate date2=LocalDate.of(2024,Month.AUGUST,23);
		
		System.out.println(date1);
		System.out.println(date2);
		
		LocalTime time1=LocalTime.of(6, 20);
		LocalTime time2=LocalTime.of(6,20,15);
		LocalTime time3=LocalTime.of(6, 20, 15, 400);
		System.out.println(time1);
		System.out.println(time2+"--- "+time3);
		
		LocalDate today=LocalDate.now();
		System.out.println("year is : "+today.getYear());
		System.out.println("year is : "+today.getDayOfMonth());	
		System.out.println("year is : "+today.getDayOfYear());
		
		//find out age of your birthday by taking date of birth
		System.out.println("Find age for your date for your date of birth using LocalDate() methods");
	    LocalDate birthday = LocalDate.of(2003,03,04);
	    
	    Period age=Period.between(birthday, today);
	    System.out.print(age.getYears()+"years "+age.getMonths()+"months "+age.getDays()+"days");
	    
	    
	    //localtime
	    
	    LocalTime localTime = LocalTime.now();
	    System.out.println(localTime);
	    System.out.println("Hours:"+localTime.getHour());
	    System.out.println("Minutes:"+localTime.getMinute());
	    System.out.println("seconds:"+localTime.getSecond());
	    
	    LocalTime login = LocalTime.of(9, 30);
	    LocalTime logoff= LocalTime.of(18,30);
	    
	    LocalTime actualtime=LocalTime.now();
	    
	    System.out.println((actualtime.getHour()-login.getHour())+" hours "+(actualtime.getMinute()-login.getMinute())+" minutes he worked");
	    System.out.println((logoff.getHour()-actualtime.getHour())+" hours "+(logoff.getMinute()-actualtime.getMinute())+" minutes left to logoff");

	    //or
	    Duration workedDuration = Duration.between(login, actualtime);
	    System.out.println(workedDuration);
	    System.out.println(workedDuration.toHours()+" : "+(workedDuration.toMinutes())%60);
	    
	    Duration remainingDuration = Duration.between(actualtime, logoff);
	    System.out.println(remainingDuration.toHours()+" : "+(remainingDuration.toMinutes())%60);

	}

}
