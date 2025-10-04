public class StaticNonStatic {

    public static void main(String[] args) {
        Person.city = "Sacramento";
        String cityName = Person.getCity();

        Person p1 = new Person();
        p1.name = "Aman";
        p1.age = 11;
        p1.height = 4.9f;
        p1.weight = 80;

        Person p2 = new Person();
        p2.name = "Naidu";
        p2.age = 35;
        p2.height = 5.6f;
        p2.weight = 120;


        System.out.println(Person.city); // Sacramento
        System.out.println(p1.city +", "+p2.city); // Sacramento, Sacramento
        System.out.println(p1.name +", "+p2.name); // Aman, Naidu

        p1.city = "Folsom";
        System.out.println(p1.city +", "+p2.city);// Folsom, Folsom

        //Person.STATE = "NY"; // final variables can't be changed
        System.out.println(Person.STATE); // CA
    }
    // static members belong to class
    // for static you don't have to create an object EX. Line 28 We can just write Person.STATE instead of p1.STATE
    // static members can only reach other static members because static members are loaded first, and it can not reach code loaded after(non-static members)
    // non-static members belong to instance(object) of the class
    // for non-static you have to create an object EX. Line 25 we need to write p1.STATE instead of Person.STATE
    // non-static members can reach static or non-static members because non-static members are loaded after, and it can  reach code loaded before(static members)
    // final means that the variable can not be changed in the middle of the code and to do this you need to capitalize your VARIABLE
    static class Person {
        final static String STATE = "CA";
        String name;
        float age;
        float height;
        float weight;
        static String city;

        public float calculateBmi() {
            return (age * height)/weight;
        }
        public static String getCity() {
            return city;
        }
    }
}
