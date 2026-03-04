import java.util.*;

public class Tower_Of_Hanoi{
        public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();

        solve(n,1,3,2,ans);

        return ans;
    }
    public static void solve(int n,int source,int destination,int helper,ArrayList<ArrayList<Integer>>ans){
        if(n==0){
           return;
        }

        solve(n-1,source,helper,destination,ans);

        ans.add(new ArrayList<>(Arrays.asList(source,destination)));

        solve(n-1,helper,destination,source,ans);
    }
}

/*
    move(n,source,destination,helper)

    steps:
     1. move(n-1,source--->helper);
     2. move(n,source--->destination);
     3. move(n-1,helper--->destination);

*/

/*
    minimum number of moves

    return (int)Math.pow(2,n)-1;
*/