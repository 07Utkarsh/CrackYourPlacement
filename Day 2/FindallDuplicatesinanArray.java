class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=Math.abs(nums[i]);
            int idx=c-1;
            if(nums[idx]<0){
                res.add(c);
            }
            nums[idx]=-nums[idx];
        }
        return res;
    }
}