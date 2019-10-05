import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("enter string");
        string = scanner.nextLine();
        System.out.println("enter index");
        int n;
        n = scanner.nextInt();
        System.out.println("substring=  " + string.substring(n));
    }
}
