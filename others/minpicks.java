// Do not write code to include libraries, main() function or accept any input from the console.
// Initialization code is already written and hidden from you. Do not write code for it again.
public class Solution {
    public int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;

        for(int i = 0 ; i<A.length;i++){
            if(A[i]%2 == 0){
                maxEven = Math.max(maxEven,A[i]);
            }else{
                minOdd = Math.min(minOdd,A[i]);
            }
        }


        return maxEven - minOdd;


    }
}

