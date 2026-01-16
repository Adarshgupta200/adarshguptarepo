import java.util.*;
public class GridPathI {
    public static char grid [][];
    public static Long dp[][];
    public static final int mod = 1000000007;
    public static long ad(int n){
        dp = new Long[n+1][n+1];
       // Arrays.fill(dp[i], -1);
        return solve(0, 0, n);
    }
    public static long solve(int i, int j, int n){
        if(i>=n || j>=n || grid[i][j]=='*') return 0;
        if(i == n-1 && j==n-1) return 1;
        if(dp[i][j]!=null) return dp[i][j];
        long right = solve(i, j+1, n);
        long down = solve(i+1, j, n);
        return dp[i][j]= (right+down)%mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        grid = new char[n][n];
        for(int i=0; i<n; i++){
            grid[i]=sc.next().toCharArray();
        }
        System.out.println(ad(n));
    }
}
