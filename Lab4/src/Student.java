import java.util.ArrayList;

public class Student {
	private String no_ID;
	private Biodata biodata;
	private int form;
	private School school;
	private ArrayList<Parent> parents;
	
	public Student() {}
	public void setNo_ID(String no_ID) {
		this.no_ID = no_ID;
	}
	
	public void setForm(int form) {
		this.form = form;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	public void setBiodata(Biodata biodata) {
		this.biodata = biodata;
	}
	
	public void setParents(ArrayList<Parent> parents) {
		this.parents = parents;
	}
	
	public String getNo_ID() {
		return no_ID;
	}
	
	public int getForm() {
		return form;
	}
	
	public School getSchool() {
		return school;
	}
	
	public Biodata getBiodata() {
		return biodata;
	}
	
	public ArrayList<Parent> getParents(){
		return parents;
	}
}
