public class prime {
    public static void main(String[] args) {
        int num = 5;
        boolean value = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                value = true;
                break;
            }
        }
        if (!value) {
            System.out.println(num + "is a prime number");
        } else {
            System.out.println(num + "is not a prime number");
        }
    }
}
