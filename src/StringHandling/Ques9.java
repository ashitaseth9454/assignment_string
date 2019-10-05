package StringHandling;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
        int upperWeight = 0;
        int lowerWeight = 0;
        for (int i = 0; i < a.length(); i++) {
            char t = a.charAt(i);
            if (t >= 65 && t <= 90) {
                upperWeight = upperWeight + t;
            } else {
                lowerWeight = lowerWeight + t;
            }

        }
        int absoluteWeight = (upperWeight - lowerWeight);
        if (absoluteWeight < 0) {
            absoluteWeight = absoluteWeight * (-1);
        }
        System.out.println("ABSOLUTE WEIGHT=" + (absoluteWeight));
    }
}
