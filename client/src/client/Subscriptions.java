package client;

import artifact.MyWebService;
import artifact.MyWebServiceService;

public class Subscriptions {
	public static void makeSubscription(){
		System.out.println("Subscriptions SOAP Client starting [Subscription]");
		MyWebServiceService as = new MyWebServiceService(); 
		MyWebService asp = as.getMyWebServicePort();
		
		//String result = asp.makeSubscription("email", "address", "course");
		//System.out.println("Result: "+result);
	}
	
	public static void removeSubscriptions(){
		System.out.println("Subscriptions SOAP Client starting [Unsubscription]");
		MyWebServiceService as = new MyWebServiceService(); 
		MyWebService asp = as.getMyWebServicePort();
		
		//String result = asp.removeSubscription("email", "address", "course");
		//System.out.println("Result: "+result);
	}
}
