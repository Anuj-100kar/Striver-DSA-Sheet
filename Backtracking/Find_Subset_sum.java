import java.util.*;

public class Find_Subset_sum{
     public static ArrayList<ArrayList<Integer>> 
    findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();

        backtrack(arr,0,k,new ArrayList<>(),result);

        return result;
    }
    public static void backtrack(ArrayList<Integer>arr,int i,int k,ArrayList<Integer>curr,ArrayList<ArrayList<Integer>>result){

        if(i==arr.size()){
            if(k==0){
                result.add(new ArrayList<>(curr));
            }
            return;
        }

        curr.add(arr.get(i));
        backtrack(arr,i+1,k-arr.get(i),curr,result);

        curr.remove(curr.size()-1);

        backtrack(arr,i+1,k,curr,result);
    }
}