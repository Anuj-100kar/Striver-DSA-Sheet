import java.util.*;

public class Relative_Sorting{
    public static List<Integer> relativeSorting(List<Integer> arr, List<Integer> brr, int n, int m) {
        //first we have place elements which present in both as per BRR sequence,
		//then we have to append rem element in ans;

		Map<Integer,Integer>map=new HashMap<>();
		for(int num:arr){
			map.put(num,map.getOrDefault(num,0)+1);
		}

		List<Integer>ans=new ArrayList<>();
		for(int num:brr){
			if(map.containsKey(num)){
				int freq=map.get(num);

				while(freq-- >0){
					ans.add(num);
				}
				map.remove(num);
			}
		}

		List<Integer>rem=new ArrayList<>();
		for(int num:map.keySet()){
			int freq=map.get(num);
			while(freq-- >0){
				rem.add(num);
			}
		}
		Collections.sort(rem);
		ans.addAll(rem);
		return ans;
    }
}