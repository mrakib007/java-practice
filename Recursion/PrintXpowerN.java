package Recursion;

//stack height = n

public class PrintXpowerN {
    public static int calculatePower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpowerNm1 = calculatePower(x, n-1);
        int xpowerN = x * xpowerNm1;
        return xpowerN;
    }
    public static void main(String[] args) {
        int x = 2,n=5;
        int ans = calculatePower(x, n);
        System.out.println(ans);
    }
}
