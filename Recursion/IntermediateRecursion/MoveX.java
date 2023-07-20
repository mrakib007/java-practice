package Recursion.IntermediateRecursion;

public class MoveX {
    public static void MoveAllX(String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == 'x') {
            count++;
            MoveAllX(str, index + 1, count, newString);
        } else {
            newString += currChar;
            MoveAllX(str, index + 1, count, newString); // newString = newString + currentChar
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        MoveAllX(str, 0, 0, "");
    }
}

// Time complexity O(n) here n is the length of the string.