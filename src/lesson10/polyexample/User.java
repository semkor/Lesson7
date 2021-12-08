package lesson10.polyexample;

import lesson10.polyexample.Human;

public class User extends Human {

    public User(String name){
        super(name);
    }

    @Override
    void run() {
        System.out.println("User class is called...");
        super.run();
    }
}
