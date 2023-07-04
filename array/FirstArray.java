package array;

import java.util.Scanner;

public class FirstArray {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 95;
        // marks[1] = 90;
        // marks[2] = 92;
        // System.out.println(marks[1]);

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] numbers = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
