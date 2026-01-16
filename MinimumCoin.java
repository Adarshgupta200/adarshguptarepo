import java.util.*;
public class MinimumCoin {
    public static Integer dp [];
    public static int ad(int arr[], int t){
       
        dp = new Integer [t+1];
        Arrays.fill(dp, -1);
        return solve(arr, t);
    }
    public static int solve(int coin[], int t){
     
        if(t == 0)  return 0;
        if(t<0) return (int)1e9;
        if(dp[t]!=-1) return dp[t];
        int ans = (int)1e9;
        for(int i=0; i<coin.length; i++){
            ans = Math.min(ans, 1+solve(coin, t-coin[i]));
        }  
        return dp[t]=ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int arr []= new int [x];
        for(int i=0; i<x; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ad(arr,t));
    }
}
