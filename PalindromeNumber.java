class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
           return false;
        }
        if(x>10&&x%10==0){
            return false;
        }
        int sum=0;
        int temp=x;
        int r;
        while(x>0){
           
            sum=sum*10+x%10;
            x=x/10;

        }
       
    
    return sum==temp || temp==sum;
    }
}
