class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0;
        int j=nums.length-1;
        int[] sq = new int[nums.length];
        while(i<=j){
            sq[i]=nums[i]*nums[i];
            sq[j]=nums[j]*nums[j];
            i++;
            j--;
        }
        for(int k=0;k<nums.length;k++){
            for(int x=0;x<nums.length-1-k;x++){
                if(sq[x]>sq[x+1]){
                    int temp=sq[x];
                    sq[x]=sq[x+1];
                    sq[x+1]=temp;
                }
            }
        }
        return sq;
    }
}