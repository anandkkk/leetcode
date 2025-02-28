// https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] indexArry = new int[130];
        int maxLength = 0;
        int index = 1;
        int currentIndex = 1;
        int length = 0;
        int previousIndex = 0;
        for(char c:s.toCharArray()){
                previousIndex = indexArry[c];
                if(index <= previousIndex){
                    length = currentIndex - index;
                    if(length > maxLength ){
                        maxLength = length;
                    }
                    index = previousIndex + 1;
                }
                indexArry[c] = currentIndex;
                currentIndex++;
            }
            length = currentIndex - index;
            if( length > maxLength){
                    maxLength = length;
            }
            return maxLength;
        }
        

}
