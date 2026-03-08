import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {
    public static List< List < Integer > > combSum(int []ARR, int B) {
        Arrays.sort(ARR);
        List<List<Integer>>ans=new ArrayList<>();
        backtrack(ARR,B,0,0,ans,new ArrayList<>());
        return ans;
    }
    public static void backtrack(int ARR[],int B,int index,int currsum,List<List<Integer>>ans,List<Integer>curr){

        if(currsum==B){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(index==ARR.length || currsum>B)return;

        curr.add(ARR[index]);
        backtrack(ARR,B,index,currsum+ARR[index],ans,curr);

        curr.remove(curr.size()-1);

        backtrack(ARR,B,index+1,currsum,ans,curr);


    }
}
