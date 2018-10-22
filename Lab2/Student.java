public class Student{
	private String no_id;
	private Biodata biodata;
	private int form;
	private School school;
	
	public Student(){}
	
	public void setNo_ID(String no_id){
		this.no_id = no_id;
	}
	
	public void setForm(int form){
		this.form = form;
	}
	
	public void setSchool(School school){
		this.school = school;
	}
	
	public void setBiodata(Biodata biodata){
		this.biodata = biodata;
	}
	
	public String getNo_ID(){
		return no_id;
	}
	
	public int getForm(){
		return form;
	}
	
	public School getSchool(){
		return school;
	}
	
	public Biodata getBiodata(){
		return biodata;
	}
}