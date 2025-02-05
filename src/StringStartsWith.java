public class StringStartsWith {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        String prefix = "Aman";
        char[] chars = name.toCharArray();
        char[] prefixArray = prefix.toCharArray();
        checking(prefixArray, chars);
    }
    // todo: time complexity
    private static void checking(char[] prefix, char[] chars) {
        int count =0;
        for (int i = 0; i < prefix.length; i++) {
            boolean isPrefix = isPrefix(prefix, chars, i);
            if (isPrefix) {
                count++;
            }
        }
        if(count== prefix.length){
            System.out.println("Prefix");
        }
        else {
            System.out.println("Not Prefix");
        }
    }

    private static boolean isPrefix(char[] prefix, char[] chars,int i) {
        if (chars[i]== prefix[i]){
            return true;
        }
        return false;
    }
}