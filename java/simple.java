import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("ENTER TWO NUMBERS");
        a = in.nextInt();
        b = in.nextInt();
        c = (a + b) + (b + b) + (a * b);
        System.out.println("The result was" + c);
    }

}
