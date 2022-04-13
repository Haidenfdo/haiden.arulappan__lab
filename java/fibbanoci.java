public class fibbanoci {
    public static void main(String[] args) {

        int num2 = 0;
        int num3 = 1;

        int result;

        for (int i = 0; i <= 10; i++) {

            result = num2 + num3;
            System.out.println(result);
            num2 = num3;
            num3 = result;
        }
    }

}
