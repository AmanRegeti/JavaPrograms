package accessModifier;

public class Private2 {
    public static void main(String[] args) {
        Private obj = new Private();
       // obj.PrivateFunction();
        //Private members can not be accessed from outside of the class in the same package
    }
}
