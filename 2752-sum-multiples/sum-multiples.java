class Solution {
    public int sumOfMultiples(int n) {
        int temp =n;
        int count=0;
       
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum=sum+i;

            }
        }
        return sum;
        
    }
}