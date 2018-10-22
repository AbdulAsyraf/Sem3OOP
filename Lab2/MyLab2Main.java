public class MyLab2Main{
	public static void main (String [] args){
		Student student = new Student();
		Address homeAddress = new Address(789, "Jalan Munshi Abdullah", 75400, "Melaka", "0623232323");
		Address schoolAddress = new Address(5, "Jalan Tun Fatimah", 75400, "Melaka", "0625252525");
		School school = new School();
		Biodata biodata = new Biodata();
		
		biodata.setNo_id("A12345");
		biodata.setName("Ahmad");
		biodata.setHome_address(homeAddress);
		
		school.setName("Sekolah Tun Tijah");
		school.setAddress(schoolAddress);
		
		student.setNo_ID("A12345");
		student.setForm(5);
		student.setSchool(school);
		student.setBiodata(biodata);
		
		System.out.println("No id: " + biodata.getNo_id());
		System.out.println("Biodata:");
		System.out.println("No_id: " + biodata.getNo_id());
		System.out.println("Name: " + biodata.getName());
		System.out.println("Address: ");
		System.out.println(homeAddress.getNumber() + ", " + homeAddress.getRoad() + ",");
		System.out.println(homeAddress.getPostcode() + " " + homeAddress.getState());
		System.out.println(homeAddress.getNo_tel());
		System.out.println("Form: " + student.getForm());
		System.out.println("School");
		System.out.println(school.getName());
		System.out.println("School Address:");
		System.out.println(schoolAddress.getNumber() + ", " + schoolAddress.getRoad() + ",");
		System.out.println(schoolAddress.getPostcode() + " " + schoolAddress.getState());
		System.out.println(schoolAddress.getNo_tel());
	}
}
