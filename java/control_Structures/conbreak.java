package control_Structures;

public class conbreak {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 15; i += 2) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

}
