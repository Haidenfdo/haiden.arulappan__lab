import java.util.Scanner;

public class average {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int num1 = in.nextInt();
        int sum = 0, num2;
        for (int i = 1; i <= num1; i++) {
            System.out.println("Enter the number" + i + ":");
            num2 = in.nextInt();
            sum += num2;
        }
        System.out.println("The sum of the given number is" + sum);
        System.out.println("The average of the given number is" + sum / num1);
    }

}
