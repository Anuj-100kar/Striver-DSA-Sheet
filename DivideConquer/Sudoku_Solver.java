import java.util.*;
public class Sudoku_Solver{
    public static boolean isItSudoku(int matrix[][]) {
        return solver(matrix);
	}
    public static boolean solver(int board[][]){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]==0){
                    for(int num=1;num<=9;num++){
                        if(isvalid(board,i,j,num)){
                            board[i][j]=num;

                            if(solver(board))return true;
                            board[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isvalid(int board[][],int row,int col,int num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num)return false;
        }

        for(int i=0;i<9;i++){
            if(board[i][col]==num)return false;
        }

        int startrow=row-row%3;
        int startcol=col-col%3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[startrow+i][startcol+j]==num)return false;
            }
        }
        return true;
    }
}