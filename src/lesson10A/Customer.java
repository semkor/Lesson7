package lesson10A;

public class Customer {

    private String name;
    private String city;
    private String gender;

    public Customer proverka(String gender) {
        if (gender!="Мужской" && gender!="Женский") {
            throw new IllegalArgumentException(gender + " is not a valid name");
        }
        this.gender = gender;
        return this;
    }

    public Customer(String name, String city, String gender) {
        this.name = name;
        this.city = city;
        proverka(gender);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
