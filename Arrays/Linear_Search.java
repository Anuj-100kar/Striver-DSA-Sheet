import java.util.*;
public class Linear_Search {
    public static int linearSearch(int n, int num, int []arr){
        for(int i=0;i<n;i++){
            if(arr[i]==num)return i;
        }
        return -1;
    }
}