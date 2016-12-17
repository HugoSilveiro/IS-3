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
			 
			 option = sc.nextInt();
			 if(option == 1){
				 //Subscribe
				 MyWebServiceService as = new MyWebServiceService();
				 System.out.println(as);
				 MyWebService asp = as.getMyWebServicePort();
				 System.out.println(asp);
				 System.out.println(asp.getName("Zé"));
				 break;
			 }
			 else if(option == 2){
				//Unsubscribe
				 break;
			 }
		}
	 }
}