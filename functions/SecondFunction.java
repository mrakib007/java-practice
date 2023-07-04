package functions;

import java.util.Scanner;

public class SecondFunction {
    public static int printSum(int x,int y){
        return x+y;
    }
    public static int multiplyNum(int x,int y){
        return x*y;
    }
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("This is less than 1");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int sum = printSum(a, b);
        int multiply = multiplyNum(a,b);
        calculateFactorial(n);
        System.out.println(sum);
        System.out.println(multiply);
    }
}
