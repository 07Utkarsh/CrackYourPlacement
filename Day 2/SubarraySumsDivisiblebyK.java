class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefix_sum=0,res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix_sum+=nums[i];
            int mod=prefix_sum%k;
            if(mod<0){
                mod=mod%k+k;
            }
            if(map.containsKey(mod)){
                res+=map.get(mod);
            }
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return res;
    }
}