public class Customer {
    private String FirstName;
    private String LastName;
    public String PhoneNumber;
    private Address FullAddress = new Address();
//    private String City;
//    private String Street;
//    private int HouseNumber;

    public Customer(String FirstName, String LastName, String PhoneNumber, String CityName, String Street, int HouseNumber) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.FullAddress.setCity(CityName);
        this.FullAddress.setStreet(Street);
        this.FullAddress.setHouseNumber(HouseNumber);
//        this.City = City;
//        this.Street = Street;
//        this.HouseNumber = HouseNumber;
    }

    public String  GetFullName() {
        return ("Name: " + FirstName + " " + LastName);
    }

    public String GetFullAddress() {
        return ("Address: " + FullAddress.getCity() + " city, " + FullAddress.getStreet() + " st., " + FullAddress.getHouseNumber());
    }
}
