package lesson7;

import lesson6.Car;
import lesson6.DbConnector;
import lesson6.User;

public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        new User();
        new User();
        new User();
        new User("Jack");
        new Car(10000, 2015, "Anton");
        new DbConnector();
    }
}
