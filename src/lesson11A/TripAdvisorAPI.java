package lesson11A;

public class TripAdvisorAPI implements API{
    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    //специальные параметры
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        int count2 = 0;
        int number = 0;
        Room tmp=null;
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
            if (tmp.getPersons() != rooms[i].getPersons()) {
                if ((((tmp.getPersons() - 1) >= rooms[i].getPersons()) && (rooms[i].getPersons() < tmp.getPersons())) || ((rooms[i].getPersons() > tmp.getPersons()) && (rooms[i].getPersons() <= (tmp.getPersons() + 1)))) {
                    count2++;
                }

            }
        }

        Room[] methodRoom2 = new Room[count + count2];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                methodRoom2[number] = rooms[i];
                number++;
            }
        }
        for (int i = 0; i < rooms.length; i++) {
            if (tmp.getPersons() != rooms[i].getPersons()) {
                if (((tmp.getPersons() - 1) >= rooms[i].getPersons()) && (rooms[i].getPersons() < tmp.getPersons())) {
                    methodRoom2[number] = rooms[i];
                    number++;
                }
            }
        }
        for (int i = 0; i < rooms.length; i++) {
            if (tmp.getPrice() != rooms[i].getPrice()) {
                if ((rooms[i].getPersons() > tmp.getPersons()) && (rooms[i].getPersons() <= (tmp.getPersons() + 1))) {
                    methodRoom2[number] = rooms[i];
                    number++;
                }
            }
        }
        return methodRoom2;
    }


    @Override
    public Room[] getAll() {
        return rooms;
    }
}
