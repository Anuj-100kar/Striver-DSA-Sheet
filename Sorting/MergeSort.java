class Solution {
    public int[] mergeSort(int[] nums) {
        if(nums==null || nums.length<=1){
            return nums;
        }
        sort(nums,0,nums.length-1);
        return nums;
    }
    private void sort(int nums[],int low,int high){
        if(low>=high)return;
        int mid=low+(high-low)/2;

        sort(nums,low,mid);
        sort(nums,mid+1,high);

        merge(nums,low,mid,high);
    }
    private void merge(int nums[],int low,int mid,int high){
        int left=low,right=mid+1;

        List<Integer>ans=new ArrayList<>();

        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                ans.add(nums[left]);
                left++;
            }else{
                ans.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            ans.add(nums[left]);
            left++;
        }
        while(right<=high){
            ans.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            nums[i]=ans.get(i-low);
        }
    }
}