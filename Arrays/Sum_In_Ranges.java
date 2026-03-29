
import java.util.*;

public class Sum_In_Ranges {

    static long mod=1_000_000_007;
    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {

        
        long prefix[]=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=(prefix[i]+arr[i])%mod;
        }
        long totalsum=prefix[n];

        java.util.function.LongUnaryOperator getsum=(k)->{
            long full=k/n;
            long rem=k%n;

            long res=(full%mod*totalsum%mod)%mod;
            res=(res+prefix[(int)rem])%mod;
            return res;
        };

         List<Integer>ans=new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            long L=queries.get(i).get(0);
            long R=queries.get(i).get(1);

            long res=(getsum.applyAsLong(R)-getsum.applyAsLong(L-1)+mod)%mod;
            ans.add((int)res);
        }
        return ans;

    }
}