package lesson11A;

/*находит комнаты по заданным параметрам,
а так же комнаты, которые по цене отличаются на 100 единиц в обе стороны
Пример: если цена комнаты 50  - возвращает все комнаты с ценой 0-150
 */

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        int count2 = 0;
        int number = 0;
        Room tmp = null;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                tmp = rooms[i];
                count++;
            }
        }
        if(count==0){
            return null;
        }
        for (int i = 0; i < rooms.length; i++) {
            if (tmp.getPrice() != rooms[i].getPrice()) {
                if ((((tmp.getPrice() - 50) >= rooms[i].getPrice()) && (rooms[i].getPrice() < tmp.getPrice())) || ((rooms[i].getPrice() > tmp.getPrice()) && (rooms[i].getPrice() <= (tmp.getPrice() + 50)))) {
                    count2++;
                }

            }
        }

        Room[] methodRoom1 = new Room[count + count2];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                methodRoom1[number] = rooms[i];
                number++;
            }
        }
        for (int i = 0; i < rooms.length; i++) {
            if (tmp.getPrice() != rooms[i].getPrice()) {
                if (((tmp.getPrice() - 50) >= rooms[i].getPrice()) && (rooms[i].getPrice() < tmp.getPrice())) {
                    methodRoom1[number] = rooms[i];
                    number++;
                }
            }
        }
        for (int i = 0; i < rooms.length; i++) {
            if (tmp.getPrice() != rooms[i].getPrice()) {
                if ((rooms[i].getPrice() > tmp.getPrice()) && (rooms[i].getPrice() <= (tmp.getPrice() + 50))) {
                    methodRoom1[number] = rooms[i];
                    number++;
                }
            }
        }
        return methodRoom1;
}


    //общие параметры
    @Override
    public Room[] getAll() {
        return rooms;
    }
}
