package Loops;

import java.util.Scanner;

public class SumJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i,j;

        for(i=0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);

        for(j=1;j<=10;j++){
            System.out.println(j*n);
        }
    }
}
