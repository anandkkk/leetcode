class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        boolean isPalindrome = true;
        int[] digits = new int[32];
        int z = x;
        int index = -1;
        while(z > 0){
            digits[++index] = z%10;
            z = z/10;
        }
        int start = 0 ;
        int end = index;

        while(start < end){
            if(digits[start++] != digits[end--]){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
        
    }
}
