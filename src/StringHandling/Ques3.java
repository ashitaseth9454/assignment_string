package StringHandling;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;

        s1 = sc.nextLine();
        s1 = s1.replace('a', '*');
        s1 = s1.replace('e', '*');
        s1 = s1.replace('i', '*');
        s1 = s1.replace('o', '*');
        s1 = s1.replace('u', '*');
        System.out.println(s1);


    }
    }

