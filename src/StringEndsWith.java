public class StringEndsWith {
    public static void main(String[] args) {
        //find if suffix
        String name = "Aman Regeti";
        String suffix = "Regeti";
        FindIfSuffix1(name.toCharArray(), suffix.toCharArray());
        FindIfSuffix2(name.toCharArray(), suffix.toCharArray());
        FindIfSuffix3(name.toCharArray(), suffix.toCharArray());

    }
 //todo: overloading
    private static void FindIfSuffix1(char[] name, char[] suffix) {
        for (int i = suffix.length - 1, j = name.length - 1; i >= 0; j--, i--) {
            char n1 = name[j];
            char s1 = suffix[i];
            boolean isSuffix = equals(n1, s1);
            if (!isSuffix) {
                System.out.println("not suffix");
                return;
            }
        }
        System.out.println("suffix");
    }



    private static void FindIfSuffix2(char[] name, char[] suffix) {
        int count = 0;
        int length = suffix.length;
        for (int i = suffix.length - 1, j = name.length - 1; i >= 0; j--, i--) {
            char n1 = name[j];
            char s1 = suffix[i];
            boolean isSuffix = equals(n1, s1);
            if (isSuffix) {
                count++;
            } else {
                System.out.println("not suffix");
                break;
            }
        }
        boolean equals  = equals(count, length);
        if (equals) {
            System.out.println("suffix");
        }

    }

    private static boolean equals(char n1, char s1) {
        if (n1 == s1) {
            return true;
        }
        return false;
    }

    private static boolean equals(int count, int length) {
        if (count == length) {
            return true;
        }
        return false;
    }
    private static void FindIfSuffix3(char[] name, char[] suffix) {
        for (int i = 0, j = name.length - suffix.length; i < suffix.length; j++, i++) {
            char n1 = name[j];
            char s1 = suffix[i];
            boolean isSuffix = equals(n1, s1);
            if (!isSuffix) {
                System.out.println("not suffix");
                return;
            }
        }
        System.out.println("suffix");
    }
}