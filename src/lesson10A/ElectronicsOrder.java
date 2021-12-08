package lesson10A;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;
    private int dostavka;


    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths, int dostavka) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
        this.dostavka = dostavka;
    }

    @Override
    public void validateOrder() {
        if (getShipFromCity().equalsIgnoreCase("Киев") || getShipFromCity().equalsIgnoreCase("Одесса")
                || getShipFromCity().equalsIgnoreCase("Днепр") || getShipFromCity().equalsIgnoreCase("Харьков"))
            System.out.println("Из города " + getShipFromCity() + " осуществляются заказы");
        else {
            System.out.println("Из города " + getShipFromCity() + " не осуществляются заказы");
            System.out.println("Выберите из следующих городов: Киев, Одесса, Днепр, Харьков");
        }

        if (getShipToCity().equalsIgnoreCase("Киев") || getShipToCity().equalsIgnoreCase("Одесса")
                || getShipToCity().equalsIgnoreCase("Днепр") || getShipToCity().equalsIgnoreCase("Харьков"))
            System.out.println("Доставка в город " + getShipToCity() + " осуществляется");
        else {
            System.out.println("Доставка в город " + getShipToCity() + " не осуществлется");
            System.out.println("Выберите из следующих городов: Киев, Одесса, Днепр, Харьков");
        }
    }

    @Override
    public void calculatePrice() {
        if (getTotalPrice() < 100)
            System.out.println("Минимальная цена заказа 100 грн");

        if (getCustomerOwned().getGender() != "Женский")
            System.out.println("Пол может быть только женский");

        if (getShipToCity().equalsIgnoreCase("Киев") || getShipToCity().equalsIgnoreCase("Одесса"))
            price = (getBasePrice() + dostavka) * 0.90;
        else
            price = (getBasePrice() + dostavka) * 0.85;

        if (getTotalPrice() > 1000 && dostavka == 0) {
            price *= 0.95;
        }
    }
}
