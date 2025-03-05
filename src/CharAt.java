public class CharAt {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        int index = 6;
        charAt(name.toCharArray(), index);
    }

    private static void charAt(char[] name,int index) {

        if (index >= name.length){
            System.out.println("too high");
            return;
        }
        System.out.println(name[index]);
    }
}
