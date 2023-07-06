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

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}

public class OOPS1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rakib";
        s1.age = 24;

        s1.printInfo(s1.age);
    }
}

