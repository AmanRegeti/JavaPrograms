public class DifferenceBetweenIncresingAndDecresing {
    public static void main(String[] args) {
        int[] a = {11, 19, 31, 5, 7, 9};
        int values= orderChange(a);
        if (values==-1){
            System.out.println("No Order Change");
        } else {
            int result = difference(a[values-1], a[values]);
            System.out.println(result);
        }
    }


    /*
        find out when order is changing and
        find the difference between the two numbers
     */
    static int orderChange(int[] a) {

        for (int j = 0, i = j + 1; i < a.length; i++, j++) {
            if (a[j] > a[i]) {
                return  i;
            }
        }
        return -1;
    }

    static int difference(int n1, int n2) {
        int answer = n1 - n2;
        return answer;
    }
}
