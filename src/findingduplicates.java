public class findingduplicates {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 2,3 };
        int target=3;
        int count=0;
            for (int i =0; i< a.length; i++) {
                if (a[i] == target) {
                    count++;
                }
            }
                if (count>1){
                    System.out.println("yes there are duplicates");
                }
                else {
                    System.out.println("no there are not duplicates ");
            }
        System.out.println("____________________________________________________");

        }
    }

