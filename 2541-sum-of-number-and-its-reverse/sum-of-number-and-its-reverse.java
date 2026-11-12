class Solution {
    public boolean sumOfNumberAndReverse(int num) {
     for(int i=0;i<=num;i++){
        int rev=0;
        int temp=i;
        while(temp>0){ //172
            int digit = temp%10; //2 
            rev=(rev*10)+digit; //2
            temp=temp/10; // 17

        }
        int res=i+rev;
        if(res==num){
            return true;
        }
        
     }
     return false;   
    }
}