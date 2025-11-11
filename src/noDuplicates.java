import java.util.*;

public class noDuplicates {
    public static void main(String[] args) {
       // int[] a = {2, 4, 7,1,1,1,1,1,1,1,1,1,1, 1, 3, 4, 6, 7, 7,2, 4, 7,1,1,1,1,1,1,1,1,1,1, 1, 3, 4, 6, 7, 7,2, 4, 7,1,1,1,1,1,1,1,1,1,1, 1, 3, 4, 6, 7, 7};
//        ArrayList a = new ArrayList();
//        a.add(1);
//        a.add(2);
//        a.add(4);
//        a.add(1);
//        a.add(3);
//        a.add(0);
//        a.add(1);
//        a.add(2);
//        a.add(4);
//        a.add(1);
//        a.add(3);
//        a.add(0);
//        a.add(1);
//        a.add(2);
//        a.add(4);
//        a.add(1);
//        a.add(3);
//        a.add(0);
//        a.add(5);
//        a.add(3);
//        a.add(1);
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 12.5f;
        p1.height = 5.7f;
        p1.weight = 70.5f;
        Person p2 = new Person();
        p2.name="Bob";
        p2.age= 13.6f;
        p2.height= 6;
        p2.weight=79.3f;
        Person p3 = new Person();
        p3.name = "John";
        p3.age = 12.5f;
        p3.height = 5.7f;
        p3.weight = 70.5f;
        Person[] people = {p1,p2,p3};
       int[] a = {1,1,2,13,4,3,1,31,4,32,5,46,1,3,2,1};
        System.out.println(Arrays.toString(a));
        findingIfAndRemovingDuplicates(a);
        noDuplicatesUsingSet1(a);
        noDuplicates(people);
//        noDuplicatesUsingSet(a);
    }

    private static void findingIfAndRemovingDuplicates(int[] a) {
        ArrayList b = new ArrayList();
        for (int i =0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int e1 =a[i];
                int e2 =a[j];
                    if (!b.contains(e1) && i!=j) {
//                        if (e1 == e2) {
                           b.add(e1);
//                        }
                    }
            }
        }
        System.out.println(b);
       // removeZero(a);
    }


    private static void noDuplicatesUsingSet1(int[] a){
        Set<Integer> set = new HashSet<>();
        for (int element : a){
            set.add(element);
        }
        System.out.println(set);
    }
    private static void noDuplicates(Person[] people){
        Set<Person> set = new HashSet<>();
        for (Person element : people) {
            set.add(element);
        }
        System.out.println(set);
        System.out.println(Arrays.toString(people));
    }
        public static void hashmap(String[] args) {
            HashMap<String, String> capitalCities = new HashMap<>();
            capitalCities.put("England", "London");
            capitalCities.put("India", "New Dehli");
            capitalCities.put("Austria", "Wien");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("Norway", "Oslo second"); // Duplicate


            String capitalOfEngland = capitalCities.get("England"); // "London"
            System.out.println("Capital of England: " + capitalOfEngland);
            for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
            System.out.println(capitalCities);
        }

}

