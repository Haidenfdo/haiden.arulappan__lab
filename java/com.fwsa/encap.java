
    public class encap {
        public int result;
        
        public void add(int num1,int num2) {
            result=num1+num2;
            System.out.println("The sum of the given two numbers is:"+ result);
        }
        public void sub(int num1,int num2) {
            result=num1-num2;
            System.out.println("The difference between the two numbers is :"+ result);
        }
        public void mul(int num1,int num2) {
            result=num1*num2;
            System.out.println("The product of the two number is: "+ result);
        }
        class MyCalculator extends Calculator{
            public void div(int num1,int num2) {
                result=num1/num2;
                System.out.println("The division of the two numbers:"+result);
            }
            public void mod(int num1,int num2) {
                result=num1%num2;
                System.out.println("The remainder of the two numbers:"+result);
            }
        }
    
        public static void main(String[] args) {
        int num1=10;
        int num2=12;
        MyCalculator obj= new MyCalculator();
        obj.add(num1, num2);
        obj.sub(num1, num2);
        obj.mul(num1, num2);
        obj.div(num1, num2);
        obj.mod(num1, num2);
    
        }
        
    
    }

