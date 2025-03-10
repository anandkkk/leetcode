class Solution {
    String[][] palindrome = new String[1001][1001]; 

    public String longestPalindrome(String s, int start, int end){

        for(int i=end;i>=start;i--){
            for(int j=i;j<=end;j++){
                if(i==j){
                    palindrome[i][j] = s.substring(i,j+1);
                    continue;
                }
                int diff = (j-i);
                if((s.charAt(i) == s.charAt(j)) && ((1==diff) || (palindrome[i+1][j-1].length() +1 == diff))){
                    palindrome[i][j] = s.substring(i,j+1);
                    continue;
                }
                String palin1 = palindrome[i][j-1];
                String palin2 = palindrome[i+1][j];
                palindrome[i][j] = palin1.length() > palin2.length()? palin1 : palin2;
            }
        }
        return palindrome[start][end];
    }

    public String longestPalindrome(String s) {
            return longestPalindrome(s,0,s.length()-1);

        }
        
    }
