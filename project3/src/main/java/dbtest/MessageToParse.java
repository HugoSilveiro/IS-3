package dbtest;

public class MessageToParse {
	
	int course_id;


	String addedMaterials="";
	String removedMaterials="";


	MessageToParse(int id, String add, String remove){
		this.course_id=id;
		this.addedMaterials=add;
		this.removedMaterials=remove;
	}


	public int getCourse_id() {
		return course_id;
	}


	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}


	public String getAddedMaterials() {
		return addedMaterials;
	}


	public void setAddedMaterials(String addedMaterials) {
		this.addedMaterials = addedMaterials;
	}


	public String getRemovedMaterials() {
		return removedMaterials;
	}


	public void setRemovedMaterials(String removedMaterials) {
		this.removedMaterials = removedMaterials;
	};



}
