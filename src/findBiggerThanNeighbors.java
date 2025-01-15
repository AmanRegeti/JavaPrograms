// find the numbers which are bigger than its neighbors
public class findBiggerThanNeighbors {
    public static void main(String[] args) {
        int[] a = {11, 9, 15, 7, 6, 12, 10};
        biggerThanNeighbors(a);
        approach2(a);
        approach3(a);
    }

    private static void approach2(int[] a) {
        boolean foundfirst = false;
        for (int i = 1; i < a.length - 1; i++) {
            int e1 = a[i];
            int next = a[i + 1];
            int previous = a[i - 1];

            if (e1 > next && e1 > previous) {
                if (!foundfirst) {
                    foundfirst = true;
                } else {
                    System.out.println(e1);
                    break;
                }
            }
        }
    }

    private static void approach3(int[] a) {
        int firstbig = Integer.MIN_VALUE;
        int secondbig = Integer.MIN_VALUE;
        for (int i = 1; i < a.length - 1; i++) {
            int e1 = a[i];
            int next = a[i + 1];
            int previous = a[i - 1];

            if (e1 > next && e1 > previous) {
                if (firstbig == Integer.MIN_VALUE) {
                    firstbig = e1;
                } else {
                        secondbig = e1;
                    System.out.println(e1);
                        break;
                }
            }
        }
    }

    private static void biggerThanNeighbors(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            int e1 = a[i];
            int next = a[i + 1];
            int previous = a[i - 1];

            if (isBigger(e1, next, previous)) {
                count++;
                if (count == 2) {
                    System.out.println(e1);
                    break;
                }
            }
        }
    }
    private static  boolean isBigger(int e1, int next, int previous){
        if (e1>next && e1>previous) {
            return true;
        }
        return false;
    }
}
