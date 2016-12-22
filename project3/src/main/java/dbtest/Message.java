package dbtest;

import java.util.ArrayList;



public class Message {

	int course_id;


  	ArrayList<String> actual=new ArrayList<String>();
    ArrayList<String> old=new ArrayList<String>();

	String addedMaterials="";
	String removedMaterials="";
	String same="";


	Message(int id){
		this.course_id=id;
	};
}
