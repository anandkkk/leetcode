class Solution {

    public String generateString(String s){
        char[] buffer = new char[2*s.length()+2];
        int j = 0;
        for(int i=0;i<s.length();i++){
            buffer[j++] = '#';
            buffer[j++] = s.charAt(i);
        }
        buffer[j++] = '#';
        return String.copyValueOf(buffer);
    }

    public String longestPalindrome(String s) {
            
            String newString = generateString(s);
            int length = newString.length();
            int[] p = new int[length];
            int maxValue = -1;
            int maxIndex = -1;
            int l = 1; 
            int r = 1;
            
            for(int i=1;i<length;i++){
                // If say we are in bounded box, then it means in the smaller box there is a palindrome to the level to the left as to the right
                p[i] = Math.max(0, Math.min(r - i, p[l + (r - i)]));
                int right = i+p[i];
                int left = i - p[i];
                while(left > 0 && (right<length)  && newString.charAt(left) == newString.charAt(right)){
                        p[i]++;
                        left--;
                        right++;
                }
                if(i + p[i] > r) {
                   l = i - p[i];
                    r = i + p[i];
                if(p[i]> maxValue){
                    maxIndex = i;
                    maxValue = p[i];
                }
                }

            }

            return newString.substring(maxIndex-p[maxIndex]+1,maxIndex+p[maxIndex]).replace("#","");

        }
        
    }
