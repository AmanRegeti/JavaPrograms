public class IndexOf {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        char aChar = 'e';
        where(name.toCharArray(), aChar);

    }

    private static void where(char[] name, char c) {

        for (int i =0; i < name.length; i++) {
            if (name[i] == c) {
                System.out.println(c + " is in number " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
