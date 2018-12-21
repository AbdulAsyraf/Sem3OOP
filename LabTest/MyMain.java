public class MyMain{
    public static void main (String[] args){
        Customer ommar = new Customer();
        ommar.setIc("820120-12-2345");
        ommar.setName("Ommar Abdul Aziz");
        ommar.setHpNumber(198765432);
            Address addressOmmar = new Address();
            addressOmmar.setHouseNumber("123");
            addressOmmar.setStreet("Presint ICT");
            addressOmmar.setPostcode(76100);
            addressOmmar.setState("Melaka");
        ommar.setAddress(addressOmmar);

            House house = new House();
            Address address = new Address();
            address.setHouseNumber("808");
            address.setStreet("Presint Kemajuan");
            address.setPostcode(55100);
            address.setState("Selangor");
            house.setAddress(address);
            house.setType("Semi-D");
            house.setPrice(100000.00);
            house.setYear(2010);
        ommar.setHouse(house);

        BuyController buyController = new BuyController(ommar);
        System.out.println("Buyer name \t\t: " +ommar.getName());
        System.out.println("Buyer contact number \t: 0" +ommar.getHpNumber());
        System.out.println("House type \t\t: " +ommar.getHouse().getType());
        System.out.println("Year of house completed : " +ommar.getHouse().getYear());
        System.out.println("Net Price House \t: RM " +buyController.calcPrice());
    }
}