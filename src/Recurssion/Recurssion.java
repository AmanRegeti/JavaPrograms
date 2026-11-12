package Recurssion;

public class Recurssion {

    // Simple recursion example
    private static void m1(int i) {
        // Base condition
        if (i > 5) {
            return;
        }

        System.out.println("hi");

        // Recursive call
        m1(i + 1);
    }

    // Sum of all elements in an array
//

    // Sum of alternate elements in an array
    private static int sumAlternate(int[] a, int start, int end) {

        // 1. Base condition
        if (start > end) {
            return 0;
        }
        if(start == end){
            return a[start];
        }

        // 2. Solve the current problem
        int s = a[start];

        // 3. Recursion: skip one element
        int rest = sumAlternate(a, start +2, end);

        // 4. Merge the results
        int total = s + rest;
        return total;
   }
    private static int sumAlternateFromBack(int[] a, int start, int end) {

        // 1. Base condition
        if (end < start) {
            return 0;
        }
        if (end == start){
            return a[end];
        }

        // 2. Solve the current problem
        int s = a[end];

        // 3. Recursion: skip one element from the back
        int rest = sumAlternateFromBack(a, start, end - 2);

        // 4. Merge the results
        return s + rest;
    }
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        // Call m1()
        //m1(1);

        // Sum of all array elements

        // Sum of alternate array elements (11 + 13 + 15)
        int alternateResult = sumAlternate(a, 0, a.length - 1);
        System.out.println("Sum of alternate elements: " + alternateResult);
    }
}