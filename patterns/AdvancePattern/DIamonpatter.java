package patterns.AdvancePattern;

public class DIamonpatter {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            // first part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for (int j = 1; j <= i; j++) {
            // System.out.print("*");
            // }
            // for (int j = 2; j <= i; j++) {
            // System.out.print("*");
            // }

            // another way for first part
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // second part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
