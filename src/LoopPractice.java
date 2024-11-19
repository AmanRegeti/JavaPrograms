public class LoopPractice {
    public static void main(String[] args) {
        // for loop
        for(int i=0; i<10; i++) {
            System.out.println("hi");
        }
        System.out.println("outside the loop`");
        int b = 9;
        for (int a = 5; a<b; a++) {
            System.out.println("a is equal to b");
        }
        for(int a= 1, c=10; a < c; a+=2,c++) {
            System.out.println("a: "+a +" and c: "+c);
        }
    }

}
