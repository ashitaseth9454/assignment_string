package StringHandling;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        string = scanner.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(i + "\t");

        }
        System.out.print("\nchars:\t");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + "\t");
        }

    }
}
