public class Solution {
    public int[][] solve(int A) {
        int[][] result = new int[A][A];

        for(int i = 0 ; i< A;i++){
            for (int j=0;j<=i;j++){
                result[i][j] = j+1;
            }
        }
        return result;
    }
}

