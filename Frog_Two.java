import java.util.*;
public class Frog_Two {
    public static Integer dp[];
    public static int ad(int arr[], int t){
        dp = new Integer [arr.length];
      //  Arrays.fill(dp, -1);
        return solve(arr, t, 0);
    }
    public static int solve(int arr[], int t, int ind){
        if(ind==arr.length-1) return 0;
        if(dp[ind]!=null) return dp[ind];
        int cost = (int)1e9;
        for(int i=1; i<=t; i++){
            if(ind+i<=arr.length-1){
                cost = Math.min(cost , Math.abs(arr[ind]-arr[ind+i])+solve(arr, t, ind+i));
            }
        }
        return dp[ind]=cost;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    int t = sc.nextInt();
    int arr [] = new int [x];

    for(int i=0; i<x; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(ad(arr,t));
   } 
}
