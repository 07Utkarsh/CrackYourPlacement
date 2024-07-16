class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=1,max=0;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                System.out.println(prices[right]-prices[left]);
                max=Math.max(max,prices[right]-prices[left]);
            }
            else{
                left=right;
            }
            right++;
        }
        return max;
    }
}