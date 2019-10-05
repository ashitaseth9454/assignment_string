package StringHandling;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, sub, newString;
        System.out.println("enter String");
        s = sc.nextLine();
        System.out.println("enter the substring you want to replace");
        sub = sc.nextLine();
        System.out.println("enter the new string with which you want to replace");
        newString = sc.nextLine();
        System.out.println("final replaced string  " + s.replace(sub, newString));
    }
}
