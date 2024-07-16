class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(target-nums[i],i);
        }
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&map.get(nums[i])!=i){
                return new int[]{i,map.get(nums[i])};
            }
        }
        return new int[]{};
    }
}