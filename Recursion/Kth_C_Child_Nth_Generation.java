import java.util.*;

public class Kth_C_Child_Nth_Generation{
    public static String kthChildNthGeneration(int n, long k) {
		if(n==1)return "Male";

		String parent=kthChildNthGeneration(n-1,(k+1)/2);

		if(k%2==1){
			return parent;
		}else{
			return parent.equals("Male")?"Female":"Male";
		}
	}
}