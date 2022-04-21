public class strong {

    public static void main(String[] args) {

        int num = 135;

        if (strongnumber(num)) {
            System.out.println(num + "is a strong number");
        } else {
            System.out.println(num + "is not a strong number");
        }
    }

    static int facto(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    static boolean strongnumber(int num) {
        int digit, sum = 0;
        int temp = num;
        boolean flag = false;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + facto(digit);
            temp /= 10;
        }
        if (sum == num)
            flag = true;
        else
            flag = false;
        return flag;
    }

}
