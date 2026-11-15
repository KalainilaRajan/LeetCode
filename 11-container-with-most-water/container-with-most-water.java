class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int area=1;
        int max=0;
        while(j>i){
            int min=0;
            if(height[i]<height[j]){
                min = height[i];
            }
            else{
                min = height[j];
            }



            area=(j-i)*min;
            if(area>max){
                max=area;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return max;
        
    }
}