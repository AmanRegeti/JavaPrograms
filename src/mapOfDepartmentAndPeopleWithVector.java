import java.util.Vector;
import java.util.HashMap;
import java.util.Map;

public class mapOfDepartmentAndPeopleWithVector {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 12.5f;
        p1.height = 5.7f;
        p1.weight = 70.5f;
        Vector<Person> spaceForcePeople = new Vector<>();
        spaceForcePeople.add(p1);
        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 13.6f;
        p2.height = 6;
        p2.weight = 79.3f;
        Vector<Person> armyPeople = new Vector<>();
        armyPeople.add(p1);
        armyPeople.add(p2);
        Person p3 = new Person();
        p3.name = "Steve";
        p3.age = 14.6f;
        p3.height = 5;
        p3.weight = 79.3f;
        Vector<Person> marinePeople = new Vector<>();
        marinePeople.add(p1);
        marinePeople.add(p2);
        marinePeople.add(p3);
        Person p4 = new Person();
        p4.name = "Steve";
        p4.age = 14.6f;
        p4.height = 5;
        p4.weight = 79.3f;
        Vector<Person> navyPeople = new Vector<>();
        navyPeople.add(p1);
        navyPeople.add(p2);
        navyPeople.add(p3);
        navyPeople.add(p4);
        HashMap<String, Vector<Person>> capitalCities = new HashMap<>();
        capitalCities.put("Space Force", spaceForcePeople);
        capitalCities.put("Army", armyPeople);
        capitalCities.put("Marine", marinePeople);
        capitalCities.put("Navy", navyPeople);

        for (Map.Entry<String, Vector<Person>> entry : capitalCities.entrySet()) {
            if (entry.getValue().contains(p4)) {
                System.out.println(entry.getKey());
            }
        }

        // == checks memory location
        //.equals checks value
        for (Map.Entry<String, Vector<Person>> entry : capitalCities.entrySet()) {
            Vector<Person> a = entry.getValue();
            if (ifInArray(a, p4)) {
                System.out.println(entry.getKey());
            }
        }


    }

    private static boolean ifInArray(Vector<Person> a, Person p4) {
        for (int i = 0; i < a.size(); i++) {
            Person e1 = a.get(i);
            if (e1.equals(p4)) {
                return true;
            }
        }
        return false;
    }
}
