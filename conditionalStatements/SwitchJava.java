package conditionalStatements;

import java.util.Scanner;

public class SwitchJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("hello");
            break;

            case 2 : System.out.println("Guten Morgen");
            break;

            case 3 : System.out.println("How are you?");
            break;

            default: System.out.println("invalid button");
        }
    }
}
