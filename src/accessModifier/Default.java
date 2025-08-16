package accessModifier;


public class Default {
    int i;
    public static void main(String[] args) {
        Default obj = new Default();
        obj.defaultMethod();
    }
     void defaultMethod(){

        System.out.println("this is default"+i);
    }
}
