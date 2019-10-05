package StringHandling;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
        int upperWeight = 0;
        for (int i = 0; i < a.length(); i++) {
            char t = a.charAt(i);
            if (t >= 65 && t <= 90) {
                upperWeight = upperWeight + t;
            }

        }
        System.out.println("UPPER WEIGHT=" + upperWeight);
    }
}
