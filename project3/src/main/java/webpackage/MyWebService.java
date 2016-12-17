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
	public String subscribe(){
		return "Subscribe";
	}
	
	@WebMethod
	public String unsubscribe(){
		return "Unsubscribe";
	}
	
	
}
