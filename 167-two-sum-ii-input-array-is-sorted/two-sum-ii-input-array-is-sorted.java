class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] op = new int[2];
        int sum=0;
        while(j>i){
            sum = numbers[i]+numbers[j];
            if(sum==target){
                op[0]=i+1;
                op[1]=j+1;
                return op;

            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }

        }
        return op;
    }
}