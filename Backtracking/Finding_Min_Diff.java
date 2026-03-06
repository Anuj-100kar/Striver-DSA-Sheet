import java.util.*;

public class Finding_Min_Diff{
    static int mindiff;
	public static int tugOfWar(ArrayList<Integer> arr, int n) {
		mindiff=Integer.MAX_VALUE;

        int totalsum=0;
        for(int a:arr){
            totalsum+=a;
        }

        backtrack(arr,n,0,0,0,totalsum);

        return mindiff;
	}
    public static void backtrack(ArrayList<Integer>arr,int n,int index,
    int count,int currsum,int totalsum){

        if(index==n){
            if(count==n/2 || count==(n+1)/2){
                int diff=Math.abs(totalsum-2*currsum);
                mindiff=Math.min(mindiff,diff);
            }
            return;
        }

        backtrack(arr,n,index+1,count+1,currsum+arr.get(index),totalsum);

        backtrack(arr,n,index+1,count,currsum,totalsum);
    }
}