import java.util.*; 

public class Letter_Combinations_Of_Phone_No{
    static String words[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static ArrayList<String> combinations(String s){
        ArrayList<String>res=new ArrayList<>();

        if(s.length()==0)return res;

        backtrack(0,s,"",res);
		return res;
	}
    public static void backtrack(int index,String s,String curr,ArrayList<String>res){
        if(index==s.length()){
            res.add(curr);
            return;
        }

        int digit=s.charAt(index)-'2';
        String letters=words[digit];

        for(int i=0;i<letters.length();i++){
            backtrack(index+1,s,curr+letters.charAt(i),res);
        }
    }
}