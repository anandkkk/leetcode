class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int length = s.length();
        char[] newStrA = new char[length];
        int index = 0;
        int multiplier = (numRows-1)<<1;

        for(int i=0;i<numRows;i++){
            int nextIndex = i;
            boolean isEnd = (i==0) || (i==numRows-1);
            if(isEnd){
                while(nextIndex<length){
                    newStrA[index++] = s.charAt(nextIndex);
                    nextIndex = nextIndex + multiplier;
                }    
            }else{
                int previousIndex = -i;
                int currentIndex = 0;
                while(nextIndex<length){
                    newStrA[index++] = s.charAt(nextIndex);
                    currentIndex = nextIndex;
                    nextIndex = previousIndex + multiplier;
                    previousIndex = currentIndex;
                }
            }
        }
        return String.valueOf(newStrA);
    }
}
