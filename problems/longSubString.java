//https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] indexArry = new int[130];
        int maxLength = 0;
        int index = 1;
        int currentIndex = 1;
        int length = 0;
        for(char c:s.toCharArray()){
                if(index <= indexArry[c]){
                    length = currentIndex - index;
                    if(length > maxLength ){
                        maxLength = length;
                    }
                    index = indexArry[c] + 1;
                }
                indexArry[c] = currentIndex++;
            }
            length = currentIndex - index;
            if( length > maxLength){
                    maxLength = length;
            }
            return maxLength;
        }
        

}
