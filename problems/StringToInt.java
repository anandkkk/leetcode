class Solution {
    public int myAtoi(String s) {
        boolean isPositive = true;
        boolean isInt = false;
        int result = 0;
        int maxLevel = Integer.MAX_VALUE / 10;
        int minLevel = Integer.MIN_VALUE / 10;
    

        for(int i =0;i<s.length();i++){
            int ch = (int)s.charAt(i);
            if(ch >= 48 && ch <= 57){
                isInt = true;
                int value = isPositive?(ch-48):-(ch-48);
                if(value == 0  && result ==0){
                    continue;
                }
                if( (result > 0 && ((result < maxLevel) || ( result == maxLevel && value < 7))) || (result < 0 && ((result > minLevel) || (result == minLevel && value > -8) ))|| (result == 0)){
                    result = result*10 + value;
                    continue;
                }else{
                    if(isPositive){
                        result = Integer.MAX_VALUE;
                    }else{
                        result = Integer.MIN_VALUE;
                    }
                    break;
                }
                } else if(!isInt){
                    if(ch == 32) {
                        continue;
                    }
                    isInt = true;
                    if(ch == 45){
                        isPositive = false;
                        continue;
                    }
                    if(ch == 43){
                        continue;
                    }
                    break;
                }
            break;
        }
        return result;
        
    }
}
