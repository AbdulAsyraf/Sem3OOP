import java.util.ArrayList;
import bean.Address;
import bean.Biodata;
import bean.Parent;
import bean.School;
import bean.Student;

public class MyLab2Main{
    public static void main (String []args){
        String no_ID = "B02145781";
        
        Student abu = new Student();
        Address address_abu = new Address(502, "Jalan Depan 3", 75200, "Melaka", 063354116);
        Address address_sekolah = new Address(1, "Jalan Sekolah 1", 54210, "Johor", 02145755);
        Address address_bapak = address_abu;
        Address address_mak = address_abu;

        Biodata biodata_abu = new Biodata();
        biodata_abu.setNo_ID(no_ID);
        biodata_abu.setName("Abu bin Ali");
        biodata_abu.setHome_Address(address_abu);
        
        School sekolah_abu = new School();
        sekolah_abu.setName("SDAR");
        sekolah_abu.setAddress(address_sekolah);

        ArrayList<Parent> parents = new ArrayList<Parent>();

        Parent bapak = new Parent();
        bapak.setNo_ic("685214045567");
        bapak.setName("Ali bin Samad");
        bapak.setAddress(address_bapak);
        bapak.setOccupation("Branch Manager");
        bapak.setTel_no(062511424);

        Parent mak = new Parent();
        mak.setNo_ic("695412045112");
        mak.setName("Siti binti Aziz");
        mak.setAddress(address_mak);
        mak.setOccupation("Housewife");
        mak.setTel_no(062511424);

        parents.add(bapak);
        parents.add(mak);

        abu.setNo_ID(no_ID);
        abu.setForm(5);
        abu.setSchool(sekolah_abu);
        abu.setBiodata(biodata_abu);
        abu.setParents(parents);

        System.out.println("Student Details: ");
        System.out.println("No ID: " + abu.getNo_ID());
        System.out.println("Name: " + biodata_abu.getName());
        System.out.println("Address: ");
        address_abu.showAddress();
        System.out.println("Form: " + abu.getForm());
        System.out.println("School : " + sekolah_abu.getName());
        address_sekolah.showAddress();
        
        System.out.println("Parent details: ");
        for (Parent p : abu.getParents()){
            System.out.println("Name : " + p.getName());
            System.out.println("No IC : " + p.getNo_ic());
            System.out.println("Occupation : " + p.getOccupation());
            System.out.println("Phone number : " + p.getTel_no());
            System.out.println();
        }
    }
}
