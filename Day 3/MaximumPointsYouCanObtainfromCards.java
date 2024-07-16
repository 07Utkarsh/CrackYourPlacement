class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left_sum=0,right_sum=0,sum=0;
        for(int i=0;i<k;i++){
            left_sum+=cardPoints[i];
        }
        sum=left_sum;
        int j=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            left_sum-=cardPoints[i];
            right_sum+=cardPoints[j];
            j--;
            sum=Math.max(sum,left_sum+right_sum);
        }
        return sum;
    }
}