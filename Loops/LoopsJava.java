package Loops;

public class LoopsJava {
    public static void main(String[] args) {
        int i;
        for(i = 0; i<10; i++){
            System.out.println("Inside for loop");
        }

        int j = 0;
        while(j<=10){
            System.out.println("Inside while loop");
            j++;
        }

        int k = 0;
        do{
            System.out.println("Inside do while loop");
            k++;
        }while(k<10);

    }
}
