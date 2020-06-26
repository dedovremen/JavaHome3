public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(
                "Oleg",
                "Druzh",
                "+375333453467",
                "Grodno",
                "Pobedy",
                18);

        Customer customer2 = new Customer(
                "Ivan",
                "Zerski",
                "+375441453467",
                "Minsk",
                "Kirova",
                3);

        Customer customer3 = new Customer(
                "Zhanna",
                "Kustikova",
                "+375251233445",
                "Brest",
                "Lenina",
                196);


       /* Customer customers [] = new Customer[] {customer1, customer2, customer3};
        System.out.println("Customers: " + "\n");
        for (int i = 0; i < customers.length; i++){
            System.out.println(
                    customers[i].GetFullName() + "\n"
                    + "Phone number: " + customers[i].PhoneNumber + "\n"
                     + customers[i].GetFullAddress() + "\n");
            customer1.GetFullAddress();


        }*/

    }
}
