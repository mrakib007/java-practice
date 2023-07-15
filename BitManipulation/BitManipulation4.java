package BitManipulation;

import java.util.Scanner;

public class BitManipulation4 {
    public static void main(String[] args) {
        // update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        // int oper = 1; //update bit to 1 else update bit to 0
        
        int bitMask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
    }
}
