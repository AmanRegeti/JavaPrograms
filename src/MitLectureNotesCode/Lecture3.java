package MitLectureNotesCode;

public class Lecture3 {
    public static void pay(double basePay, int hours) {
        if (basePay < 8.0) {
            System.out.println("You must be paid at least $8.00/hour");
        } else if (hours > 60) {
            System.out.println("You can't work more than 60 hours a week");
        } else {

            int overtimeHours = 0;

            if (hours > 40) {

                overtimeHours = hours - 40;
                hours = 40;
            }
            double pay = basePay * hours;
            pay += overtimeHours * basePay * 1.5;
            System.out.println("Pay this employee $" + pay);
        }
    }
    public static void main(String[] arguments) {
        pay(7.5, 35);
        pay(8.2, 47);
        pay(10.0, 73);
        //Continue();
//        System.out.println(arguments.length);
//        System.out.println(arguments[0]);
//        System.out.println(arguments[1]);
        Marathon();
    }
    public static void Marathon () {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        int LTime=0;
        for (int i = 1; i < names.length; i++) {
            if (times[i] < times[LTime]){
                LTime=i;
            }

        }
        System.out.println(names[LTime] + ": " + times[LTime]);
    }

    public static void Continue() {
        for (int i = 0; i < 100; i++) {
            if(i==50)
                continue;
            System.out.println("Rule #"+i);

        }

    }
}

