import java.util.*;

public class Nth_Term_Of_GP{
        static long mod=1000000007;

    public static int nthTermOfGP(int N, int A, int R) {
		long power=power(R,N-1);

		return (int)((A%mod*power%mod)%mod);

    }
	public static long power(long base,long exp){
		long result=1;

		base=base%mod;

		while(exp>0){
			if((exp&1)==1){
				result=(result*base)%mod;
			}

			base=(base*base)%mod;
			exp=exp/2;
		}
		return result;
	}
}