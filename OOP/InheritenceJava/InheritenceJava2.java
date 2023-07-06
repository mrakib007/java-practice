package OOP.InheritenceJava;
import bank;

class Shape {
    public void area(){
        System.out.println("Display");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(.5*l*h);
    }
}

class Circle extends Shape{
    public void are(int r){
        System.out.println((3.1416)*r*r);
    }
}

public class InheritenceJava2 {
    public static void main(String[] args) {
        // bank.Account account1 = new bank.Account();
        // account1.name = "customer1";
    }
}
