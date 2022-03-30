public class operators {
    public static void main(String[] args) {

        // Arthimetic operators(+,-,*,/,%,++,--)

        int add = 100 + 50;
        System.out.println(add);

        int num1 = 100;
        int num2 = 900;
        int total = num2 - num1;
        System.out.println(total);

        // Assignment operators(=.+=,-=,*=,/=,%=,&=,|=,^=,>>=,<<=)

        int num3 = 90;
        num3 += 25;
        System.out.println(num3);

        // Comparison operators(==,!=,>,<,>=,<=)

        int num4 = 10;
        int num5 = 10;
        System.out.println(num4 == num5);

        // Logical operators(&&,||,!)

        int num6 = 10;
        System.out.println(num6 > 4 && num6 < 15);
    }
}
