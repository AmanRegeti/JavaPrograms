package MitLectureNotesCode;

import java.util.Random;

public class LectureOne {
    public static void main(String[] args) {
        assignment();
        FirstProgram();
        assignment();
        hello3();
    }
    private static void hello3() {
        String foo = "IAP 6.092";
        System.out.println(foo);
        foo = "Something else";
        System.out.println(foo);
        DoMath();
    }
    private static void DoMath(){
            double score = 1.0 + 2.0 * 3.0;
            System.out.println(score);
            score = score / 2.0;
            System.out.println(score);

    }

    private static void FirstProgram() {
        System.out.println("Hello World");
    }

    private static void assignment() {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
        double a=-9.81;
        double t=10;
        double vi=0;
        double xi=0;
        double xt= 0.5 * a * Math.pow(t,2)+vi+xi;
        System.out.println(xt);
    }
}