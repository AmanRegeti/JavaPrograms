public class majorityelement {
    public static void main(String[] args) {


        //int[] a = {1, 1, 2, 2, 2, 2, 3, 2};
        int[] a = { 2,1, 2, 1,2, 3,2, 3,2};
        boolean majorityelementfound = false;
        int elementCount = 0;
        int count = a.length / 2;

        for (int i = 0; i < a.length; i++) {
            elementCount=0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    elementCount++;
                }
            }
            //System.out.println(elementCount);
            if (elementCount > count) {
                majorityelementfound= true;
                System.out.println(a[i]);
                break;
            }

        }
        if(majorityelementfound== false){
            System.out.println("-1");
        }

    }
}
