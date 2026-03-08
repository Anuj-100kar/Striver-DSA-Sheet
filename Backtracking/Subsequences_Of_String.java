import java.util.ArrayList;

public class Subsequences_Of_String {
     public static ArrayList<String> subsequences(String str) {
        ArrayList<String>ans=new ArrayList<>();
        backtrack(str,0,"",ans);
        return ans;
    }
    public static void backtrack(String str,int index,String curr,ArrayList<String>ans){
        if(index==str.length()){
            if(!curr.isEmpty()){
                ans.add(curr);
            }
            return;
        }

        backtrack(str,index+1,curr+str.charAt(index),ans);

        backtrack(str,index+1,curr,ans);
    }
}
