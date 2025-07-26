package MitLectureNotesCode;

public class AssignmentForLecture2 {
    {
        System.out.println();
    }

        public static void main(String[] args) {
        int MinimumWage = 8;
        int PayTime = -1;
        FooCorperation(MinimumWage, PayTime);
    }

private static void FooCorperation(int MinimumWage, int PayTime) {
        if (PayTime <= 40 && PayTime >= 0) {
            System.out.println(MinimumWage * PayTime);
        } else if (PayTime > 40 && PayTime <= 60) {
            System.out.println((40 * MinimumWage) + (1.5 * MinimumWage) * (PayTime - 40) + " dollars");
        } else{
            System.out.println("Exceeded Maximum Work Hours");
        }
    }
}
