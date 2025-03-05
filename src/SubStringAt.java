import javax.swing.*;

public class SubStringAt {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        String substring = "Reg";
        checkWhere(name.toCharArray(), substring.toCharArray());
    }

    private static void checkWhere(char[] name, char[] substring) {
        boolean found1 = false;

        for (int i=0; i < name.length - substring.length; i++) {
            found1 = found(name, substring, i);
            if(found1) {
                System.out.println("found at " + i);
                break;
            }

        }
        if (!found1) {
            System.out.println("not found");
            //CheckIfEqual(slength,i, name, substring);
        }


    }

    private static boolean found(char[] name, char[] substring, int start) {
        boolean found = true;
        for (int i = start, j=0; j < substring.length ; i++,j++) {
         if (name[i] != substring[j]) {
             found= false;
             break;
         }
        }
        return found;
    }
   /* private static void CheckIfEqual(int sLength, int i,char[] name, char[] substring, int start){
        int count=0;
        for (int j = 0; j < sLength; j++) {
            boolean found= found(j,substring,name,start);
         if  (equal){
             count++;
         }
        }
        boolean equals= equals(count, sLength);
        if (equals){
            System.out.println(i-sLength+" - " + i);
        }
    }*/
    /*private static boolean equals(int i,int j){
        if ()
    }*/
}
