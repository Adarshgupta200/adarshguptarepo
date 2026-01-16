import java.util.*;
public class DiceCobination {
    public static final int mod = 1000000007;
    public static Integer dp[];
    public static int ad(int n){
        dp = new Integer[n+1];
        Arrays.fill(dp, -1);
        return solve(n);
    }
    public static int solve(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=-1) return dp[n];
        int ways = 0;
        for(int i=1; i<=6;i++){
            ways = (ways + solve(n-i))%mod;
        }
        return dp[n]=ways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
           int x = sc.nextInt();
           System.out.println(ad(x));
        }
    }
}
