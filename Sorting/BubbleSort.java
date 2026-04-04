class Solution {
    public int[] bubbleSort(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}

//optimized
/*
    static void bubbleSort(int[] arr, int n) {
        // Base case
        if (n == 1) return;

        boolean didSwap = false; // Track if any swap occurred

        // Perform one pass of bubble sort
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = true;
            }
        }

        // If no swaps were made, the array is already sorted
        if (!didSwap) return;

        // Recur for remaining elements
        bubbleSort(arr, n - 1);
    }
 */