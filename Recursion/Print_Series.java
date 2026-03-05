import java.util.*;

public static void main(String[] args) {
    public static List<Integer> printSeries(int n, int k) {
        List<Integer>ans=new ArrayList<>();
        solve(n,k,n,true,ans);
        return ans;
    }
    public static void solve(int curr,int k,int original,boolean subtract,List<Integer>ans){
        ans.add(curr);

        if(curr<=0)return;
        
        solve(curr-k,k,original,subtract,ans);

        ans.add(curr);
    }
}