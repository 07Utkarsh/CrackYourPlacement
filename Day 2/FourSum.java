class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        if (nums.length < 4 || (long) nums[0] + nums[1] + nums[2] + nums[3] > target ||
            (long) nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] + nums[nums.length - 4] < target) {
            return result; 
        }
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1,r=nums.length-1;
                while(l<r){
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum>target){
                        r--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[l]);
                        arr.add(nums[r]);
                        if(!set.contains(arr)){
                            set.add(arr);
                        }
                        int tempIndex1 = l;
                        int tempIndex2 = r;
                        while(l < r && nums[l] == nums[tempIndex1]) l++;
                        while(l < r && nums[r] == nums[tempIndex2]) r--;
                    }
                }
                while(j+1 < nums.length && nums[j] == nums[j+1]) j++;
            }
            while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
        }
        result.addAll(set);
        return result;
    }
}