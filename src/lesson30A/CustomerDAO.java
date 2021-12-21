package lesson30A;

import java.util.*;

public class CustomerDAO {

    private static Collection<Customer> customer() {
        Set<Customer> customers = new LinkedHashSet<>();
        customers.add(new Customer("OOO", "Громнафта", "Ukraine"));
        customers.add(new Customer("OOO", "Украерорух", "Ukraine"));
        customers.add(new Customer("LTN", "Google", "America"));
        customers.add(new Customer("LTN", "SAMSUNg", "KOREA"));
        customers.add(new Customer("LTN", "TOYOTA", "JAPAN"));
    return customers;
    }

    public static Collection<Customer>  getCustomerSet() {
        return customer();
    }
}
