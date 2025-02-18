public class CheckWithSubString {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        String suffix = "Reg";
        FindIfSuffix(name.toCharArray(), suffix.toCharArray());
    }
    private static void FindIfSuffix(char[] name, char[] suffix) {
        for (int i = 0, j = name.length - suffix.length; i < suffix.length; j++, i++) {
            char n1 = name[j];
            char s1 = suffix[i];
            boolean isSuffix = equals(n1, s1);
            if (!isSuffix) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
    private static boolean equals(char n1, char s1) {
        if (n1 == s1) {
            return true;
        }
        return false;
    }
}
