class Solution {
    String[][] palindrome = new String[1001][1001]; 

    public String longestPalindrome(String s, int start, int end){
        if (palindrome[start][end] !=null){
            return palindrome[start][end];
        }
        String substring = s.substring(start,end);
        if(substring.length()==1){
            palindrome[start][end] = substring;
            return palindrome[start][end];
        } 
        
        if(substring.length()<=2){
            if(substring.charAt(0)==substring.charAt(1)){
                palindrome[start][end] = substring;
                return palindrome[start][end];
            }
        }
        if(substring.charAt(0) == substring.charAt(substring.length()-1)){
            if(palindrome[start+1][end-1] ==null){
                palindrome[start+1][end-1] = longestPalindrome(s,start+1,end-1);
            }
	    String palin = palindrome[start+1][end-1];
            if(palin.length()==(substring.length()-2))
            {   
                    palindrome[start][end] = substring;
                    return palindrome[start][end];
            }
        }

        if( palindrome[start][end-1]==null){
             palindrome[start][end-1] =  longestPalindrome(s,start,end-1);
        }
	String palin1 = palindrome[start][end-1];
        if(palindrome[start+1][end]==null){
             palindrome[start+1][end] = longestPalindrome(s,start+1,end);
        }
	String palin2 = palindrome[start+1][end];
    palindrome[start][end] = palin1.length()> palin2.length()? palin1 : palin2;
        return palindrome[start][end];
    }
    public String longestPalindrome(String s) {
            return longestPalindrome(s,0,s.length());

        }
        
    }
