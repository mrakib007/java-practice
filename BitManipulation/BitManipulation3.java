package BitManipulation;

public class BitManipulation3 {
    public static void main(String[] args) {
        //clear bit
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
