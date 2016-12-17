package client;

import artifact.MyWebService;
import artifact.MyWebServiceService;

public class Statistics {
	public static void getCourses(){
		System.out.println("Statistics SOAP Client starting [Courses]");
		 
		MyWebServiceService as = new MyWebServiceService(); 
		MyWebService asp = as.getMyWebServicePort();
		
		//int number_courses = asp.getCourses();
		//System.out.ptinln("Courses: "+number_courses);
	}
	
	public static void getEmailsDay(){
		System.out.println("Statistics SOAP Client starting [Emails]");
		MyWebServiceService as = new MyWebServiceService(); 
		MyWebService asp = as.getMyWebServicePort();
		
		//int number_emails = asp.getEmailsDay();
		//System.out.ptinln("Courses: "+number_emails);
	}
	
	public static void getAllEmails(){
		System.out.println("Statistics SOAP Client starting [Emails]");
		MyWebServiceService as = new MyWebServiceService(); 
		MyWebService asp = as.getMyWebServicePort();
		
		//int number_emails = asp.getAllEmails();
		//System.out.ptinln("Courses: "+number_emails);
	}
}
