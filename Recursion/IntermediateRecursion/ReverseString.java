package Recursion.IntermediateRecursion;

public class ReverseString {
    public static void printReverse(String str,int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printReverse(str, index-1);
    }
    public static void main(String[] args) {
        String str = "abcdefgh";
        printReverse(str, str.length()-1);
    }
}
//time complexity O(n)