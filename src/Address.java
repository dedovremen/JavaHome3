public class Address {
    private String City;
    private String Street;
    private int HouseNumber;

    public Address (String City, String Street, int HouseNumber) {
        this.City = City;
        this.Street = Street;
        this.HouseNumber = HouseNumber;
    }

    public String getCity() {
        return City;
    }

    public String getStreet() {
        return Street;
    }

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setHouseNumber(int houseNumber) {
        HouseNumber = houseNumber;
    }
}
