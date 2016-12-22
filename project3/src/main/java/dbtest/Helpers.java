package dbtest;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Helpers {


	static ArrayList<MessageToParse> worker () throws IOException {


	  	
		ArrayList<Message>  messages= new ArrayList<Message>();
		 ArrayList<MessageToParse>  messagesToParse= new ArrayList<MessageToParse>();



	  	Helpers.readMaterials(messages, "new.xml", 0);
	  	Helpers.readMaterials(messages, "old.xml", 1);

	  	for(int j=0;j<messages.size();j++){
			Helpers.makeMatch(messages, j);
			if(!(messages.get(j).addedMaterials.equals("")&&messages.get(j).removedMaterials.equals(""))){
				messagesToParse.add(new MessageToParse(messages.get(j).course_id,messages.get(j).addedMaterials,messages.get(j).removedMaterials));
	  	
			}
	  	}

	  	
	  	
	  	
		Helpers.copyfile();

		System.out.println(messagesToParse);
			
		return messagesToParse;

	}


		static void copyfile()  throws IOException {

		InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream("new.xml");
	        os = new FileOutputStream("old.xml");
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }

		}


	static void makeMatch(ArrayList<Message> messages,int index){
		for(int i=0;i<messages.get(index).actual.size();i++){
			if(messages.get(index).old.contains(messages.get(index).actual.get(i))){
				messages.get(index).same=messages.get(index).same+messages.get(index).actual.get(i)+ "\n";
			}
			else{
				messages.get(index).addedMaterials=messages.get(index).addedMaterials+"- "+messages.get(index).actual.get(i)+ "\n";
			}
		}

		for(int i=0;i<messages.get(index).old.size();i++){
			if(!messages.get(index).actual.contains(messages.get(index).old.get(i))){
				messages.get(index).removedMaterials=messages.get(index).removedMaterials+"- "+messages.get(index).old.get(i)+ "\n";

			}
		}
	}

	static void addMaterial(ArrayList<Message> messages,int old, String courseId, String name){
		int course=Integer.parseInt(courseId);


		for(int i=0; i<messages.size();i++){
			if(messages.get(i).course_id==course){
				if(old==0){

					messages.get(i).actual.add(name);
					return;
				}
				else if(old==1){

					messages.get(i).old.add(name);
					return;
				}
			}

		}
	messages.add(new Message(course));
	addMaterial(messages, old, courseId, name);
	return;


	}


	static void readMaterials(ArrayList<Message> messages, String filename, int old) throws IOException{

	try {

	File fXmlFile = new File(filename);
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);

	//optional, but recommended
	//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
	doc.getDocumentElement().normalize();


	NodeList nList = doc.getElementsByTagName("org.mule.util.CaseInsensitiveHashMap");
	



	for (int temp = 1; temp < nList.getLength(); temp=temp+2) {


		Node nNode = nList.item(temp);
		Element eElement = (Element) nNode;

			addMaterial(messages, old, eElement.getElementsByTagName("int").item(2).getTextContent(), eElement.getElementsByTagName("string").item(2).getTextContent());


		System.out.println();

		
	}

    } catch (FileNotFoundException e) {
    	copyfile();
    } catch (Exception e) {
    }
	}
}
