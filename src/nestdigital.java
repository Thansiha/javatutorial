import java.util.Scanner;

public class nestdigital {
    String EMPNAME;
    String DESIGNATION;
    int EMPID;
    public static void main(String[] args) {
        System.out.println("hello world");
        nestdigital obj1 = new nestdigital();
        Scanner input = new Scanner(System.in);
        System.out.print("enter name:");
        obj1.EMPNAME=input.nextLine();
        System.out.print("enter designation:");
        obj1.DESIGNATION=input.nextLine();
        System.out.print("enter empid:");
        obj1.EMPID=input.nextInt();

    }
}
