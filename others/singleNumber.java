public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        if (A.length == 0){
            return 0;
        }
        for (int i=1;i<A.length;i++){
            A[0] = A[0] ^ A[i];
        }

        return A[0];
    }
}

