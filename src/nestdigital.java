import java.util.Scanner;

public class nestdigital {
    String EMPNAME;
    String DESIGNATION;
    int EMPID;
    public static void main(String[] args) {
        System.out.println("hello world");
        nestdigital obj1 = new nestdigital();
        Scanner input = new Scanner(System.in);
        System.out.println("enter name");
        obj1.EMPNAME=input.nextLine();
        System.out.println("enter designation");
        obj1.DESIGNATION=input.nextLine();
        System.out.println("enter empid");
        obj1.EMPID=input.nextInt();

    }
}
