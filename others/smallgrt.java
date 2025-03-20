public class Solution {
    public int solve(ArrayList<Integer> A) {
        int len = A.size();
        if(len < 2){
            return 0;
        }

        int max = A.get(0);
        int min =  max;
        int cMax = 1;
        int cMin = 1;
        for(int i = 1 ;i< len;i++){
            int value = A.get(i);
            if(max < value){
                cMax = 1;
                max = value;
            } else if(max == value){
                cMax++;
            }else if(min == value){
                cMin++;
            }else if(min > value){
                cMin = 1;
                min = value;
            }
        }
        if( max == min){
            return len - cMax;
        }

        return len - cMax - cMin;

        
    }
}

