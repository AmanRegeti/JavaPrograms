public class FindOldestPerson {
    public static void main(String[] args) {
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
        p3.name="Jeff";
        p3.age= 11;
        p3.height= 5.8f;
        p3.weight=69f;
        Person[] people = {p1,p2,p3};
        FindOldest(people);
    }
    private static void FindOldest(Person[] people){
        float Oldest=people[0].age;
        String Name= people[0].name;
        for (int i = 1; i < people.length; i++) {
            if (people[i].age > Oldest) {
                Oldest = people[i].age;
                Name = people[i].name;

            }
        }
        System.out.println(Name +" is "+Oldest+" years old");

    }
}
