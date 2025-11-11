import java.util.*;

public class mapOfDepartmentAndPeople {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 12.5f;
        p1.height = 5.7f;
        p1.weight = 70.5f;
        ArrayList<Person> spaceForcePeople = new ArrayList<>();
        spaceForcePeople.add(p1);
        Person p2 = new Person();
        p2.name="Bob";
        p2.age= 13.6f;
        p2.height= 6;
        p2.weight=79.3f;
        ArrayList<Person> armyPeople = new ArrayList<>();
        armyPeople.add(p1);
        armyPeople.add(p2);
        Person p3 = new Person();
        p3.name="Steve";
        p3.age= 14.6f;
        p3.height= 5;
        p3.weight=79.3f;
        ArrayList<Person> marinePeople = new ArrayList<>();
        marinePeople.add(p1);
        marinePeople.add(p2);
        marinePeople.add(p3);
        Person p4 = new Person();
        p4.name="Alex";
        p4.age= 15.6f;
        p4.height= 5;
        p4.weight=90.9f;
        ArrayList<Person> navyPeople = new ArrayList<>();
        navyPeople.add(p1);
        navyPeople.add(p2);
        navyPeople.add(p3);
        navyPeople.add(p4);
        HashMap<String, List<Person>> capitalCities = new HashMap<>();
        capitalCities.put("Space Force", spaceForcePeople);
        capitalCities.put("Army", armyPeople);
        capitalCities.put("Marine", marinePeople);
        capitalCities.put("Navy", navyPeople);
        for (Map.Entry<String, List<Person>> entry : capitalCities.entrySet()) {
            if (entry.getValue().contains(p4)){

            }
        }

    }
}
