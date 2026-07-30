package building;
import java.util.ArrayList;
import java.util.List;

public class BuildingClient {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        Room room1 = new Room(RoomTypes.LIVING_ROOM,3,5);
        Room room2 = new Room(RoomTypes.BED_ROOM,2,2);
        Room room3 = new Room(RoomTypes.BATH_ROOM,1,0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        List<Apartment> apartments1 = new ArrayList<>();
        Apartment apartment101 = new Apartment(101,rooms);
        Apartment apartment102 = new Apartment(102,rooms);
        apartments1.add(apartment101);
        apartments1.add(apartment102);

        List<Apartment> apartments2 = new ArrayList<>();
        Apartment apartment201 = new Apartment(201,rooms);
        Apartment apartment202 = new Apartment(202,rooms);
        apartments2.add(apartment201);
        apartments2.add(apartment202);

        List<Apartment> apartments3 = new ArrayList<>();
        Apartment apartment301 = new Apartment(301,rooms);
        Apartment apartment302 = new Apartment(302,rooms);
        apartments3.add(apartment301);
        apartments3.add(apartment302);

        List<Floor> floors = new ArrayList<>();
        Floor floor1 = new Floor('1', apartments1);
        Floor floor2 = new Floor('2', apartments2);
        Floor floor3 = new Floor('3', apartments3);
        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);
        Building buildingA = new Building('a', floors);
//        Building buildingB = new Building('b', floors);
//        Building buildingC = new Building('c', floors);
    }
}
