public class CheckWithSubString {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        String substring = "Reg";

        CheckIfIn(name.toCharArray(), substring.toCharArray());
    }

    private static void CheckIfIn(char[] name, char[] substring) {
        boolean found = false;
        for (int i = 0; i <= name.length - substring.length; i++) {
            found = findSubString(name, substring, i);
            if (found) {
                System.out.println("found");
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }

    }

    private static boolean findSubString(char[] name, char[] substring, int start) {
        boolean found = true;
        for (int i = start, j = 0; j < substring.length; i++, j++) {
            if (substring[j] != name[i]) {
                found = false;
            }
        }
        return found;
    }

    private static void CheckSubstring(char[] name, char[] substring) {
        boolean found = false;
        for (int i = 0; i < name.length - substring.length; i++) {
            found = findSubString2(name, substring, i);
            if (found) {
                System.out.println("found");
                break;
            }
        }
        if (!found) {
            System.out.println("not found");

        }
    }

    private static boolean findSubString2(char[] name, char[] substring, int start) {
        boolean found = true;
        for (int i = start, j = 0; i < name.length; i++) {
            if (name[i] != substring[j]) {
                found = false;
            }
            return found;
        }
        return found;
    }
}