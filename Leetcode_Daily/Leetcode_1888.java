import java.util.*;

public class Leetcode_1784{
    public int minFlips(String s) {
        int n=s.length();
        String doubled=s+s;

        int res=Integer.MAX_VALUE;
        int mis1=0,mis2=0;

        for(int i=0;i<doubled.length();i++){
            char exp1=(i%2==0)?'0':'1';
            char exp2=(i%2==0)?'1':'0';

            if(doubled.charAt(i)!=exp1)mis1++;
            if(doubled.charAt(i)!=exp2)mis2++;

            if(i>=n){
                char prev1=((i-n)%2==0)?'0':'1';
                char prev2=((i-n)%2==0)?'1':'0';

                if(doubled.charAt(i-n)!=prev1)mis1--;
                if(doubled.charAt(i-n)!=prev2)mis2--;
            }

            if(i>=n-1){
                res=Math.min(res,Math.min(mis1,mis2));
            }
        }
        return res;
    }
}