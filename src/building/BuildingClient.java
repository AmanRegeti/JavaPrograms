package building;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildingClient {

    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();

        Room room1 = new Room(RoomTypes.LIVING_ROOM, 3, 5);
        Room room2 = new Room(RoomTypes.BED_ROOM, 2, 2);
        Room room3 = new Room(RoomTypes.BATH_ROOM, 1, 0);
        Room room4 = new Room(RoomTypes.PATIO, 1, 0);
        Room room5 = new Room(RoomTypes.OFFICE_ROOM, 1, 2);
        Room room6 = new Room(RoomTypes.KITCHEN, 1, 1);

        rooms.add(room1);
        rooms.add(room2);

        List<Apartment> apartments1 = new ArrayList<>();
        Apartment apartment101 = new Apartment(101, rooms);
        Apartment apartment102 = new Apartment(102, rooms);
        Apartment apartment103 = new Apartment(103, rooms);

        apartments1.add(apartment101);
        apartments1.add(apartment102);
        apartments1.add(apartment103);

        List<Apartment> apartments2 = new ArrayList<>();
        Apartment apartment201 = new Apartment(201, rooms);
        Apartment apartment202 = new Apartment(202, rooms);
        Apartment apartment203 = new Apartment(203, rooms);
        Apartment apartment204 = new Apartment(204, rooms);
        Apartment apartment205 = new Apartment(205, rooms);
        Apartment apartment206 = new Apartment(206, rooms);
        Apartment apartment207 = new Apartment(207, rooms);

        apartments2.add(apartment201);
        apartments2.add(apartment202);
        apartments2.add(apartment203);
        apartments2.add(apartment204);
        apartments2.add(apartment205);
        apartments2.add(apartment206);
        apartments2.add(apartment207);

        List<Apartment> apartments3 = new ArrayList<>();
        Apartment apartment301 = new Apartment(301, rooms);
        Apartment apartment302 = new Apartment(302, rooms);

        apartments3.add(apartment301);
        apartments3.add(apartment302);

        List<Apartment> apartments4 = new ArrayList<>();
        Apartment apartment401 = new Apartment(401, rooms);
        Apartment apartment402 = new Apartment(402, rooms);
        Apartment apartment403 = new Apartment(403, rooms);
        Apartment apartment404 = new Apartment(404, rooms);

        apartments4.add(apartment401);
        apartments4.add(apartment402);
        apartments4.add(apartment403);
        apartments4.add(apartment404);

        List<Apartment> apartments5 = new ArrayList<>();
        Apartment apartment501 = new Apartment(501, rooms);
        Apartment apartment502 = new Apartment(502, rooms);
        Apartment apartment503 = new Apartment(503, rooms);
        Apartment apartment504 = new Apartment(504, rooms);
        Apartment apartment505 = new Apartment(505, rooms);
        Apartment apartment506 = new Apartment(506, rooms);
        Apartment apartment507 = new Apartment(507, rooms);
        Apartment apartment508 = new Apartment(508, rooms);
        Apartment apartment509 = new Apartment(509, rooms);

        apartments5.add(apartment501);
        apartments5.add(apartment502);
        apartments5.add(apartment503);
        apartments5.add(apartment504);
        apartments5.add(apartment505);
        apartments5.add(apartment506);
        apartments5.add(apartment507);
        apartments5.add(apartment508);
        apartments5.add(apartment509);

        List<Apartment> apartments6 = new ArrayList<>();
        Apartment apartment601 = new Apartment(601, rooms);
        Apartment apartment602 = new Apartment(602, rooms);
        Apartment apartment603 = new Apartment(603, rooms);
        Apartment apartment604 = new Apartment(604, rooms);
        Apartment apartment605 = new Apartment(605, rooms);
        Apartment apartment606 = new Apartment(606, rooms);

        apartments6.add(apartment601);
        apartments6.add(apartment602);
        apartments6.add(apartment603);
        apartments6.add(apartment604);
        apartments6.add(apartment605);
        apartments6.add(apartment606);

        List<Apartment> apartments7 = new ArrayList<>();
        Apartment apartment701 = new Apartment(701, rooms);
        Apartment apartment702 = new Apartment(702, rooms);
        Apartment apartment703 = new Apartment(703, rooms);
        Apartment apartment704 = new Apartment(704, rooms);

        apartments7.add(apartment701);
        apartments7.add(apartment702);
        apartments7.add(apartment703);
        apartments7.add(apartment704);

        List<Apartment> apartments8 = new ArrayList<>();
        Apartment apartment801 = new Apartment(801, rooms);
        Apartment apartment802 = new Apartment(802, rooms);
        Apartment apartment803 = new Apartment(803, rooms);
        Apartment apartment804 = new Apartment(804, rooms);
        Apartment apartment805 = new Apartment(805, rooms);
        Apartment apartment806 = new Apartment(806, rooms);
        Apartment apartment807 = new Apartment(807, rooms);
        Apartment apartment808 = new Apartment(808, rooms);
        Apartment apartment809 = new Apartment(809, rooms);
        Apartment apartment810 = new Apartment(810, rooms);

        apartments8.add(apartment801);
        apartments8.add(apartment802);
        apartments8.add(apartment803);
        apartments8.add(apartment804);
        apartments8.add(apartment805);
        apartments8.add(apartment806);
        apartments8.add(apartment807);
        apartments8.add(apartment808);
        apartments8.add(apartment809);
        apartments8.add(apartment810);

        List<Apartment> apartments9 = new ArrayList<>();
        Apartment apartment901 = new Apartment(901, rooms);
        Apartment apartment902 = new Apartment(902, rooms);
        Apartment apartment903 = new Apartment(903, rooms);
        Apartment apartment904 = new Apartment(904, rooms);
        Apartment apartment905 = new Apartment(905, rooms);
        Apartment apartment906 = new Apartment(906, rooms);
        Apartment apartment907 = new Apartment(907, rooms);

        apartments9.add(apartment901);
        apartments9.add(apartment902);
        apartments9.add(apartment903);
        apartments9.add(apartment904);
        apartments9.add(apartment905);
        apartments9.add(apartment906);
        apartments9.add(apartment907);

        List<Floor> floors = new ArrayList<>();

        Floor floor1 = new Floor('1', apartments1);
        Floor floor2 = new Floor('2', apartments2);
        Floor floor3 = new Floor('3', apartments3);
        Floor floor4 = new Floor('4', apartments4);
        Floor floor5 = new Floor('5', apartments5);
        Floor floor6 = new Floor('6', apartments6);
        Floor floor7 = new Floor('7', apartments7);
        Floor floor8 = new Floor('8', apartments8);
        Floor floor9 = new Floor('9', apartments9);

        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);
        floors.add(floor4);
        floors.add(floor5);
        floors.add(floor6);
        floors.add(floor7);
        floors.add(floor8);
        floors.add(floor9);

        List<Building> buildings = new ArrayList<>();

        Building buildingA = new Building('a', floors);
        Building buildingB = new Building('b', floors);
        Building buildingC = new Building('c', floors);
        Building buildingD = new Building('d', floors);
        Building buildingE = new Building('e', floors);

        buildings.add(buildingA);
        buildings.add(buildingB);
        buildings.add(buildingC);
        buildings.add(buildingD);
        buildings.add(buildingE);

        ApartmentPerson aman = new ApartmentPerson("Aman", 12, 5, 100);
        ApartmentPerson john = new ApartmentPerson("John", 14, 5.5, 115);
        ApartmentPerson mike = new ApartmentPerson("Mike", 13, 5.2, 102);
        ApartmentPerson sarah = new ApartmentPerson("Sarah", 16, 5.6, 120);

        Map<ApartmentPerson, List<Building>> map = new HashMap<>();

        map.put(aman, buildings);
        map.put(john, buildings);
        map.put(mike, buildings);
        map.put(sarah, buildings);

        check(map);

        countPeople(map, 5, 9, 52, 2);

        countPeopleWithBuilding(map, 52, 9);
    }

    private static void check(Map<ApartmentPerson, List<Building>> map) {

        for (Map.Entry<ApartmentPerson, List<Building>> entry : map.entrySet()) {

            ApartmentPerson person = entry.getKey();
            List<Building> buildings = entry.getValue();

            if (person.name().equals("Aman")) {
                checkBuildings(buildings);
            }
        }
    }

    private static void checkBuildings(List<Building> buildings) {

        for (Building building : buildings) {
            checkFloors(building);
        }
    }

    private static void checkFloors(Building building) {

        List<Floor> floors = building.getFloors();

        for (Floor floor : floors) {
            checkApartments(building, floor);
        }
    }

    private static void checkApartments(Building building, Floor floor) {

        List<Apartment> apartments = floor.getApartments();

        for (Apartment apartment : apartments) {
            checkRooms(building, apartment);
        }
    }

    private static void checkRooms(Building building, Apartment apartment) {

        List<Room> rooms = apartment.getRooms();

        for (Room room : rooms) {

            if (apartment.getRooms().size() == 2) {
                System.out.println(building);
            }
        }
    }

//    private static void countPeople(
//            Map<ApartmentPerson, List<Building>> map,
//            int requiredBuildings,
//            int requiredFloors,
//            int requiredApartments,
//            int requiredRooms) {
//
//        int peopleCount = 0;
//
//        for (Map.Entry<ApartmentPerson, List<Building>> entry : map.entrySet()) {
//
//            ApartmentPerson person = entry.getKey();
//            List<Building> buildings = entry.getValue();
//
//            if (checkBuildingRequirements(
//                    buildings,
//                    requiredBuildings,
//                    requiredFloors,
//                    requiredApartments,
//                    requiredRooms)) {
//
//                peopleCount++;
//
//                System.out.println(
//                        person.name() + " has the required structure."
//                );
//            }
//        }
//
//        System.out.println("Total people: " + peopleCount);
//    }

    private static void countPeopleWithBuilding(
            Map<ApartmentPerson, List<Building>> map,
            int requiredApartments,
            int requiredRooms) {


        int peopleCount = 0;
        boolean hasMatchingBuilding = false;
        for (Map.Entry<ApartmentPerson, List<Building>> entry : map.entrySet()) {

            ApartmentPerson person = entry.getKey();
            List<Building> buildings = entry.getValue();




            int apartmentCount = 0;
            for (Building building : buildings) {

                List<Floor> floors = building.getFloors();

                for (Floor floor : floors) {
                    List<Apartment> apartments = floor.getApartments();
                    apartmentCount = apartments.size();
                    for (Apartment apartment : apartments) {

                        int roomCount = apartment.getRooms().size();

                        if (roomCount == requiredRooms){
                            hasMatchingBuilding = true;
                            }
                        }
                    }
                }

                if (apartmentCount == requiredApartments) {
                    hasMatchingBuilding = true;
                    break;
                }
            }


            if (hasMatchingBuilding) {
                peopleCount++;

                System.out.println(
                        person.name()
                                + " has a building with "
                                + requiredApartments
                                + " apartments and "
                                + requiredFloors
                                + " floors."
                );
            }
        }

        System.out.println("Total people with a matching building: " + peopleCount);
    }

    private static boolean checkBuildingRequirements(
            List<Building> buildings,
            int requiredBuildings,
            int requiredFloors,
            int requiredApartments,
            int requiredRooms) {

        if (buildings.size() != requiredBuildings) {
            return false;
        }

        for (Building building : buildings) {

            List<Floor> floors = building.getFloors();

            if (floors.size() != requiredFloors) {
                return false;
            }

            int apartmentCount = 0;

            for (Floor floor : floors) {

                List<Apartment> apartments = floor.getApartments();

                for (Apartment apartment : apartments) {

                    apartmentCount++;

                    List<Room> rooms = apartment.getRooms();

                    if (rooms.size() != requiredRooms) {
                        return false;
                    }
                }
            }

            if (apartmentCount != requiredApartments) {
                return false;
            }
        }

        return true;
    }
}

