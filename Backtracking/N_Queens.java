import java.util.*;

public class N_Queens{
    public static ArrayList<ArrayList<Integer>> nQueens(int n)
    {
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();
        int board[]=new int[n];
        backtrack(0,n,board,result);
        return result;
    } 
    public static void backtrack(int row,int n,int board[],ArrayList<ArrayList<Integer>>result){
        if(row==n){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i]==j){
                        temp.add(1);
                    }else{
                        temp.add(0);
                    }
                }
            }
            result.add(temp);
            return;
        }

        for(int col=0;col<n;col++){
            if(issafe(row,col,board)){
                board[row]=col;
                backtrack(row+1,n,board,result);
            }
        }
    }
    public static boolean issafe(int row,int col,int board[]){
        for(int i=0;i<row;i++){
            if(board[i]==col || Math.abs(board[i]-col)==Math.abs(i-row)){
                return false;
            }
        }
        return true;
    }
}