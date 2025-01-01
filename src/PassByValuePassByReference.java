public class PassByValuePassByReference {
    public static void main(String[] args) {
        int value= 10;
        int[] reference = {1,2,3};

        int doubledAge = DoubleAge(value);

        System.out.println(doubledAge);
        System.out.println(value);

    }

    static int DoubleAge(int value)
    {
        value *=2;
        return  value;
    }

    /*static int TripleAge( int[] reference)
    {
        value *=3;
        return  value;
    }*/
}
