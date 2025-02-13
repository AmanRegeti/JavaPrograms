public class primeornot {
    public static void main(String[] args) {

        //Method 1 - with Bool variable
//        int target=6;
//        boolean isprime = true;
//        for (int i=2; i<target; i++ ){
//            if (target % i ==0)
//            {
//                isprime= false;
//                //System.out.println(target  + " is not a prime number");
//                break;
//            }
//         }
//        if (isprime){
//            System.out.println(target  + " is a prime number");
//        }
//        else
//        {
//            System.out.println(target + " is not a prime number");
//        }

        //Method 2 - without Bool variable
        int n=15;

        for (int i=2; i<n; i++ ){
            if (n % i ==0)
            {
                System.out.println(n  + " is not a prime number");
                return;
                //break;
            }
        }
        System.out.println(n  + " is a prime number");

    }
}
