package Recursion;

public class PrintXpowerN {
    public static int caculatePower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpowerNm1 = caculatePower(x, n-1);
        int xpowerN = x * xpowerNm1;
        return xpowerN;
    }
    public static void main(String[] args) {
        int x = 2,n=5;
        int ans = caculatePower(x, n);
        System.out.println(ans);
    }
}
