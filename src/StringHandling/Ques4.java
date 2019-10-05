package StringHandling;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        s1 = sc.nextLine();
        int c = 1;
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
                if (c == 1) {
                    s1 = s1.replace(a, '*');
                    c = c + 1;                                       //all the a are replaced by * so basically its a wrong program and we cannot do it with replace method
                } else if (c == 2) {
                    s1 = s1.replace(a, '^');
                    c = c + 1;

                } else if (c == 3) {
                    s1 = s1.replace(a, '!');
                    c = c + 1;

                }
                if (c == 4) {
                    c = 1;
                }

            }


        }
        System.out.println(s1);
    }
}
