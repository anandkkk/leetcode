class Solution {

    public String generateString(String s){
        char[] buffer = new char[2*s.length()+1];
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

            int[] p = new int[newString.length()];
            int maxValue = -1;
            int maxIndex = -1;

            for(int i=0;i<newString.length();i++){
                int center = i;
                int l = center;
                int r = center;
                while(l>=0 && r<=newString.length()-1 && (newString.charAt(l) == newString.charAt(r))){
                        p[i]++;
                        r++;
                        l--;
                }

                if(p[i]> maxValue){
                    maxIndex = i;
                    maxValue = p[i];
                }
            }

            return newString.substring(maxIndex-p[maxIndex]+1,maxIndex+p[maxIndex]).replace("#","");

        }
        
    }
