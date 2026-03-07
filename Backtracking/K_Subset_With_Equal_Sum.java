import java.util.*;

public class K_Subset_With_Equal_Sum{
     static boolean splitArray(int arr[], int K) { 
        int sum=0;
        for(int a:arr)sum+=a;

        if(sum%K!=0)return false;

        boolean used[]=new boolean[arr.length];
        return backtrack(arr,used,K,0,0,sum/K);
    } 
    static boolean backtrack(int arr[],boolean used[],int K,int start,int currsum,int targetsum){

        if(K==1)return true;

        if(currsum==targetsum){
            return backtrack(arr,used,K-1,0,0,targetsum);
        }

        for(int i=start;i<arr.length;i++){
            if(used[i])continue;

            if(currsum+arr[i]>targetsum)continue;

            used[i]=true;

            if(backtrack(arr,used,K,i+1,currsum+arr[i],targetsum))return true;

            used[i]=false;
        }
        return false;
    }
}