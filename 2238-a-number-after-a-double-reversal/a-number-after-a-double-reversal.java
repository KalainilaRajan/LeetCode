class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
		int temp2=temp;
	
		int rev=0;
		while(temp>0){
		    int digit = temp%10;
		    rev=(rev*10)+digit;
		    temp= temp/10;
		}
		int revcheck=0;
		while(rev>0){
		    int digit = rev%10;
		     revcheck=(revcheck*10)+digit;
		     rev=rev/10;
		    
		    
		}
        if(revcheck==num){
            return true;
        }
        else{
            return false;
        }
        
    }
}