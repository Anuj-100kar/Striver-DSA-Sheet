import java.util.*;

public class All_Possible_Permutations{
     public static List<String> findPermutations(String s) {
        List<String>ans=new ArrayList<>();
        char arr[]=s.toCharArray();
        backtrack(0,ans,arr);
        return ans;
    }
    public static void backtrack(int index,List<String>ans,char arr[]){

        if(index==arr.length){
            ans.add(new String(arr));
            return;
        }

        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);
            backtrack(index+1,ans,arr);
            swap(arr,index,i);
        }
    }
    private static void swap(char arr[],int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}