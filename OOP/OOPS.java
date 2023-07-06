package OOP;

class Pen {
    String color;
    String type; // ballpoint gel pen

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // Pen pen2 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen2.color = "Grey";
        // pen2.type = "Ball point";

        // pen1.printColor();
        // pen2.printColor();

        Student s1 = new Student();
        s1.name = "Rakib";
        s1.age = 24;
        s1.printInfo();
    }
}
