class Solution {
    public int reverse(int x) {
        int y = 0;
        int i = Math.abs(x);
        int maxValue = Integer.MAX_VALUE / 10;
        while(i>=1){
            if(y > maxValue ){
                return 0;
            }
            y = y*10 + i%10;
            i = i/10;
        }
        if(x<0){
            return -y;
        }
        return y;
    }
}
