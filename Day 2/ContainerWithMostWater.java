class Solution {
    public int maxArea(int[] height) {
        int area=0,start=0,end=height.length-1;
        while(start<end){
            if(height[start]<height[end]){
                area=Math.max(area,height[start]*(end-start));
                start++;
            }
            else if(height[start]>height[end]){
                area=Math.max(area,height[end]*(end-start));
                end--;
            }
            else{
                area=Math.max(area,height[end]*(end-start));
                start++;
                end--;
            }
        }
        return area;
    }
}