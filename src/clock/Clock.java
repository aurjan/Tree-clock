package clock;

import java.util.Scanner;

public class Clock {

    private double hours;
    private double minutes;
    public static Scanner SCANNER = new Scanner(System.in);

    public static double getInput(String question) {
        System.out.println(question);
        return SCANNER.nextInt();
    }

    public void angle() {
        // Hour 12 * 60 = 720, so 0.5 degree per 1 minute.
        // Minute 360 / 60 = 6, so 6 degrees per 1 minute
        double hourAngle = 0.5D * (hours * 60 + minutes);
        double minuteAngle = 6 * minutes;
        double angle = Math.abs(hourAngle - minuteAngle);
        // returns angle which is 180<=
        angle = Math.min(angle, 360 - angle);
        System.out.println(angle);
    }

    public void run() {

        hours = getInput("Please write hours");
        minutes = getInput("Please write minutes");

        angle();
    }
}
