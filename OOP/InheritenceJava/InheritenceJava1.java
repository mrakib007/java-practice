package OOP.InheritenceJava;

class Shape {
    String color;
}

class Triangle extends Shape{}

public class InheritenceJava1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
