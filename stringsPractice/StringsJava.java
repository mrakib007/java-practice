package stringsPractice;
import java.util.Scanner;

public class StringsJava {
    public static void main(String[] args) {
        // String name = "Tony";
        // String fullName = "Stark";
        Scanner sc = new Scanner(System.in);
        // String firstName = sc.nextLine(); //for taking a full name or input with empty spaces.
        // String lastName = sc.nextLine();
        // String fullName = firstName + lastName;
        // System.out.println("Your name is : "+ fullName);
        // System.out.println(fullName.length());
        
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));

        //compare two strings
        String name1 = "Tony";
        String name2 = "Tony";

        //s1>s2 : +ve value s means string
        //s1==s2 : 0
        //s1<s2 : -ve value

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if(name1 == name2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }


        //this will give not equal
        //cause strings are treated as objects in java. this is explained in string builder 
        if(new String("tony") == new String("tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        String sentence = "My name is tony";
        //substring(beginning index, ending index);
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
    }


