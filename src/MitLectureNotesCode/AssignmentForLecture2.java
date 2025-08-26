package MitLectureNotesCode;

public class AssignmentForLecture2 {
    {
        System.out.println();
    }

        public static void main(String[] args) {
        int MinimumWage = 8;
        int PayTime = -1;
        FooCorperation(MinimumWage, PayTime);
        answer(7.5,35);
        answer(8.2,47);
        answer(10.3,73);
    }

private static void FooCorperation(int MinimumWage, int PayTime) {
        if (PayTime <= 60 && PayTime >= 40) {
            System.out.println(MinimumWage * PayTime);
        } else if (PayTime > 40 && PayTime <= 60) {
            System.out.println((40 * MinimumWage) + (1.5 * MinimumWage) * (PayTime - 40) + " dollars");
        } else{
            System.out.println("Exceeded Maximum Work Hours");
        }
    }
    private static void answer(double basePay, int hours){
        if ( basePay<8.0) {
            System.out.println("You must paid at least $8.00 a week");
        } else if (hours > 60) {
            System.out.println("You can't work more than 60 hours a week");
        }else {
            int overtime = 0;
            if (hours>40){
                overtime=hours-40;
                hours=40;
            }
            double pay= basePay*hours;
            pay+=overtime*basePay*1.5;
            System.out.println("Pay this employee $" +pay);
        }
    }
}
