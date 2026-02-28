public class getLowestBodyMass {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 12.5f;
        p1.height = 5.7f;
        p1.weight = 70.5f;
        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 13.6f;
        p2.height = 6;
        p2.weight = 79.3f;
        Person p3 = new Person();
        p3.name = "Jeff";
        p3.age = 11;
        p3.height = 5.8f;
        p3.weight = 69f;
        Person p4 = new Person();
        p4.name = "Steve";
        p4.age = 13;
        p4.height = 6f;
        p4.weight = 73f;
        Person p5 = new Person();
        p5.name = "Chris";
        p5.age = 9;
        p5.height = 4f;
        p5.weight = 100f;
        Person p6 = new Person();
        p6.name = "Greg";
        p6.age = 5;
        p6.height = 4;
        p6.weight = 50;
        MyLinkedList<Person> list4 = new MyLinkedList<>();
        list4.addFirst(p1);
        list4.addFirst(p2);
        list4.addFirst(p3);
        list4.addFirst(p4);
        list4.addFirst(p5);
        list4.addFirst(p6);
        System.out.println(list4);
        float lbm = getLowestBodyMass(list4);
        System.out.println("LBM: " + lbm);

    }
    private static float getLowestBodyMass(MyLinkedList<Person> people) {
        float lbm= calculateLbm(people.get(0));
        for (int i = 0; i<people.size(); i++) {

            if (checkifSmaller(people.get(i), lbm)){
                lbm= calculateLbm(people.get(i));
            }
        }
        return lbm;
    }
    private static boolean checkifSmaller( Person pointer,float lbm ){
        if (calculateLbm(pointer) < lbm) {
                return true;
        }
        return false;
    }
    private static float calculateLbm(Person pointer){
        float lbm= pointer.height * pointer.weight;
        return lbm;
    }
}
