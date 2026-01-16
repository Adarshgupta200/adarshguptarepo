import java.util.*;
public class Frog_One {
    public static Integer dp[];
    public static int ad(int []arr){
        dp=new Integer[arr.length+1];
        Arrays.fill(dp, -1);
        return solve(arr, 0);
    }
    public static int solve(int arr[], int n){
        if(n==arr.length -1) return 0;
        if(dp[n]!=-1) return dp[n];
        int jo = Math.abs(arr[n]-arr[n+1])+solve(arr, n+1);
        int jt = (int)1e9;
        if(n+2<arr.length){
            jt=Math.abs(arr[n]-arr[n+2])+solve(arr, n+2);
        }
        return Math.min(jo, jt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ad(arr));
    }
}
