public class Solution {
    public int[] solve(int[] A) {
        int len = A.length;
        if(len <= 2){
            return new int[0];
        }

        int max = (A[0] > A[1]) ? A[0] : A[1];
        int prevMax = (A[1] > A[0]) ? A[0] : A[1];
        for(int i = 2;i<len;i++){
            if(A[i]> max){
                prevMax = max;
                max = A[i];
            }else if(A[i]> prevMax){
                prevMax = A[i];
            }
            if(A[i]<max && A[i]<prevMax){
                continue;
            }
        }
        int[] result = new int[len-2];
        int index = 0;

        for(int i = 0; i<len ; i++){
            if(A[i] !=max && A[i] != prevMax){
                result[index++] = A[i];
            }

        }
        return result;

    }
}

