package StringHandling;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("enter string");
        s = sc.nextLine();
        System.out.println("enter character");
        char c = sc.nextLine().charAt(0);
        System.out.println("index " + s.indexOf(c));

    }
}
