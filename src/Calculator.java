import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println("enter operation to perform");
        char operator = scanner.next().charAt(0);
        calculate(a,b,operator);
    }

    public static void calculate(int a, int b, char operator){
        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}
