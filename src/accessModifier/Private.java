package accessModifier;

public class Private {
    private int i;
    public static void main(String[] args) {
        Private obj = new Private();
        obj.PrivateFunction();
    }
    private void PrivateFunction(){
        System.out.println("Hello");
        i = 15;
        System.out.println(i);
    }
}
//
