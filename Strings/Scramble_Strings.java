import java.util.*;
public class Scramble_Strings {
     
    public static boolean isScramble(String s1, String s2) {
        // Write your code here
        Map<String,Boolean>map=new HashMap<>();
        if(s1.equals(s2))return true;
        if(s1.length()!=s2.length())return false;

        String key=s1+"#"+s2;

        if(map.containsKey(key))return map.get(key);

        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }

        for(int f:freq){
            if(f!=0){
                map.put(key,false);
                return false;
            }
        }

        int n=s1.length();
        for(int i=1;i<n;i++){

            if(isScramble(s1.substring(0,i),s2.substring(0,i)) && isScramble(s1.substring(i),s2.substring(i))){
                map.put(key,true);
                return true;
            }

            if(isScramble(s1.substring(0,i),s2.substring(n-i)) && isScramble(s1.substring(i),s2.substring(0,n-i))){
                map.put(key,true);
                return true;
            }
        }
        map.put(key,false);
        return false;
    }
}