import java.util.*;

public class Paths_In_A_Maze{
    public static ArrayList<String> findAllPaths(ArrayList<ArrayList<Integer>> arr)
	{
		ArrayList<String>result=new ArrayList<>();
		int n=arr.size();
		if(arr.get(0).get(0)==0)return result;

		boolean visited[][]=new boolean[n][n];
		solve(0,0,arr,visited,"",result,n);

		return result;
	}
	public static void solve(int x,int y,ArrayList<ArrayList<Integer>>arr,boolean visited[][],String path,ArrayList<String>result,int n){
		if(x==n-1 && y==n-1){
			result.add(path);
			return;
		}

		visited[x][y]=true;
		if(issafe(x+1,y,arr,visited,n)){
			solve(x+1,y,arr,visited,path+"D",result,n);
		}

		if(issafe(x-1,y,arr,visited,n)){
			solve(x-1,y,arr,visited,path+"U",result,n);
		}

		if(issafe(x,y-1,arr,visited,n)){
			solve(x,y-1,arr,visited,path+"L",result,n);
		}

		if(issafe(x,y+1,arr,visited,n)){
			solve(x,y+1,arr,visited,path+"R",result,n);
		}

		visited[x][y]=false;
	}
	public static boolean issafe(int x,int y,ArrayList<ArrayList<Integer>>arr,boolean visited[][],int n){
		return (x>=0 && y>=0 && x<n && y<n && !visited[x][y] && arr.get(x).get(y)==1);
	}
}