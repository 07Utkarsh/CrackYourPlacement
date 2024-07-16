class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean [] arr = new boolean[n];
        for(int i = 0;i< n; i++){
            if(arr[nums[i]]) return nums[i];
            arr[nums[i]] = true;
        }
        return - 1;
    }
}