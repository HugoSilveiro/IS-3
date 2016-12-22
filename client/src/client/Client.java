package client;

import java.util.Scanner;

import artifact.MyWebService;
import artifact.MyWebServiceService;

public class Client {

	 /**
	  * @param args
	  */
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int option = 0;
		while(true){
			 System.out.println("Chose option:");
			 System.out.println("1. Subscribe");
			 System.out.println("2. Unsubscribe");
			 System.out.println("3. List");
			 
			 option = sc.nextInt();
			 if(option == 1){
				 //Subscribe
				 
				 MyWebServiceService as = new MyWebServiceService();
				 System.out.println(as);
				 MyWebService asp = as.getMyWebServicePort();
				 System.out.println(asp);
				 String aux = sc.nextLine();
				 System.out.println("Email:");
				 String email = sc.nextLine();
				 System.out.println("Address:");
				 String address = sc.nextLine();
				 System.out.println("course:");
				 int course = sc.nextInt();
				 
				 
				 System.out.println(asp.subscribe(email, address, course));
				 
				 //Get user details
				 
				 
				 
				 
				 
				 
			 }
			 else if(option == 2){
				//Unsubscribe
				 MyWebServiceService as = new MyWebServiceService();
				 System.out.println(as);
				 MyWebService asp = as.getMyWebServicePort();
				 System.out.println(asp);
				 String aux = sc.nextLine();
				 System.out.println("Email:");
				 String email = sc.nextLine();
				 System.out.println("Address:");
				 String address = sc.nextLine();
				 System.out.println("course:");
				 int course = sc.nextInt();
				 System.out.println(asp.unsubscribe(email, address, course));
				 
			 }
			 else if(option == 3){
				 MyWebServiceService as = new MyWebServiceService();
				 System.out.println(as);
				 MyWebService asp = as.getMyWebServicePort();
				 System.out.println(asp);
				 String aux = sc.nextLine();
				 System.out.println("Course:");
				 int course = sc.nextInt();
				 System.out.println(asp.listSubscribers(1));
				 //Subscribers of one specific course
				 //int course = sc.nextInt();
			 }
			 else{
				 break;
			 }
		}
	 }
}