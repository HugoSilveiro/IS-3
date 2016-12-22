package webpackage;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MyWebService {
	
	@WebMethod
	public String getName(String name){
		return "Hello " + name;
	}
	
	@WebMethod
	public String subscribe(String email, String address, int course){
		return "Subscribe";
	}
	
	@WebMethod
	public String unsubscribe(String email, String address, int course){
		return "Unsubscribe";
	}
	
	@WebMethod
	public String listSubscribers(int course){
		return "listSubscribers";
	}
}
