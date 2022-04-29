import java.util.Scanner;

public class calculator2 {

    public static void main(String[] args) {
        int num1, num2, result, choice;
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("Enter your choice");
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
        System.out.println("Enter the first number");
        num1 = in.nextInt();
        System.out.println("Enter the second number");
        num2 = in.nextInt();
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The addition of the two numbers is" + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The subtraction of the two numbers is" + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The multiplication of the two numbers is" + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("The division of the two numbers is" + result);
                break;
            default:
                System.out.println("invalid ");
        }
    }

}
