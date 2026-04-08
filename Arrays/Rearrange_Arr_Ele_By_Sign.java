class Rearrange_Arr_Ele_By_Sign {
    public int[] rearrangeArray(int[] nums) {
        int posindex=0,negindex=1;

        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[posindex]=nums[i];
                posindex+=2;
            }else{
                ans[negindex]=nums[i];
                negindex+=2;
            }
        }
        return ans;
    }
}