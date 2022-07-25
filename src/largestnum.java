import java.util.Scanner;

public class largestnum {
    static int a;
    static int b;
    int c;

    public static void main(String[] args) {
        largestnum obj = new largestnum();
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num");
        obj.a = input.nextInt();
        System.out.println("enter second num");
        obj.b = input.nextInt();
        System.out.println("enter third num");
        obj.c = input.nextInt();

        if (a > b) {
            System.out.println("a is larger");
        } else {
            System.out.println("b is larger");

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
