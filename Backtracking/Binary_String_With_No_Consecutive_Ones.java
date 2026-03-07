import java.util.*;

public class Binary_String_With_No_Consecutive_Ones {
    public static List< String > generateString(int N) {
        List<String>ans=new ArrayList<>();

        backtrack(N,ans,"");

        return ans;
    }
    public static void backtrack(int N,List<String>ans,String curr){
        if(curr.length()==N){
            ans.add(curr);
            return;
        }

        backtrack(N,ans,curr+'0');

        if(curr.length()==0 || curr.charAt(curr.length()-1)!='1'){
            backtrack(N,ans,curr+'1');
        }
    }
}
