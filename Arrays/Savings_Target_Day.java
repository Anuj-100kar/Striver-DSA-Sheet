public class Savings_Target_Day {
    public static long findTargetDay(int k, long target) {
        // Write your code here
        long l=1,r=(long)2e9;
        long limit=target/k;
        while(l<r){
            long mid=l+(r-l)/2;
            long temp;
            if(mid%2==0){
                temp=(mid/2)*(mid+1);
            }else{
                temp=(mid)*((mid+1)/2);
            }

            
            if(temp>limit){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;  
    }
}