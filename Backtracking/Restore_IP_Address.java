import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Restore_IP_Address {
    public static List<String> generateIPAddress(String s) {
        List<String>ans=new ArrayList<>();
        backtrack(ans,0,0,"",s);
        Collections.sort(ans);
        return ans;
    }
    public static void backtrack(List<String>ans,int index,int parts,String curr,String s){
        if(parts==4 && index==s.length()){
            ans.add(curr.substring(0,curr.length()-1));
            return;
        }

        if(parts>4)return;

        for(int len=1;len<=3;len++){
            if(index+len>s.length())break;

            String part=s.substring(index,index+len);

            if(isvalid(part)){
                backtrack(ans,index+len,parts+1,curr+part+".",s);
            }
        }
    }
    public static boolean isvalid(String s){
        if(s.length()>1 && s.charAt(0)=='0')return false;

        int num=Integer.parseInt(s);

        return num>=0 && num<=255;
    }
}
