package variables;
import java.util.*;

public class firstVariable {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    String name = "Tony Stark";
    int a = 5;
    int b = 10;
    double price = 10.50;
    int sum = a + b;
    int diff = a - b;
    int mul = a*b;

    String name2 = sc.next();
    String name3 = sc.nextLine();

    System.out.println(sum + diff);
    System.out.println(name);
    System.out.println(mul);
    System.out.println(name2);
    System.out.println(name3);

    // nextInt() 
    // nextFloat()
    //we can change the value of the variables.
    //Here int double string are data types.
    }
}
