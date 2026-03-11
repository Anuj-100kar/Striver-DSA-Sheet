import java.util.*;
public class Min_Swaps_Req_To_Sort_Arr {
    static class Pair{
		int val;
		int index;
		Pair(int v,int i){
			val=v;
			index=i;
		}
	}
	public static int minSwaps(int[] arr) {
		
		int n=arr.length;
		Pair pairs[]=new Pair[n];

		for(int i=0;i<arr.length;i++){
			pairs[i]=new Pair(arr[i],i);
		}

		Arrays.sort(pairs,(a,b)->a.val-b.val);
		boolean visited[]=new boolean[n];
		int swaps=0;

		for(int i=0;i<n;i++){
			if(visited[i] || pairs[i].index==i)continue;

			int cyclesize=0;
			int j=i;

			while(!visited[j]){
				visited[j]=true;
				j=pairs[j].index;
				cyclesize++;

			}
			if(cyclesize>1){
				swaps+=cyclesize-1;
			}
		}
		return swaps;
	}   
}
