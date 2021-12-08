package lesson10A;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void validateOrder() {
        if (getShipFromCity().equalsIgnoreCase("Киев") || getShipFromCity().equalsIgnoreCase("Львов"))
            System.out.println("Из города " + getShipFromCity() + " осуществляются заказы");
        else {
            System.out.println("Из города " + getShipFromCity() + " не осуществляются заказы");
            System.out.println("Выберите из двух городов: Киев, Львов");
        }
    }


    @Override
    public void calculatePrice() {
        if(getTotalPrice()<500)
            System.out.println("Минимальная цена заказа 500 грн");

        if (getCustomerOwned().getName().equalsIgnoreCase("Тест"))
            System.out.println("Имя не может быть Тест");

        if(getTotalPrice()<5000)
            price = getBasePrice()+getBasePrice()*0.05;
        else
            price = getBasePrice()+getBasePrice()*0.02;
    }
}