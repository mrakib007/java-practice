package Recursion.IntermediateRecursion;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, index + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbcxxaayyz";
        removeDuplicate(str, 0, "");
    }
}

//time complexity O(n)