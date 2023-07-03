package conditionalStatements;
import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int oddEven = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

        if(oddEven % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}

