package StringHandling;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        int weight = 0;
        for (int i = 0; i < s.length(); i++) {
            weight = weight + s.charAt(i);


        }
        System.out.println(weight);

    }

}
