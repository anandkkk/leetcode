class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int length = s.length();
        char[] newStrA = new char[length];
        int index = 0;
        int multiplier = (numRows-1)*2;

        for(int i=0;i<numRows;i++){
            int currentIndex = 0;
            int nextIndex = i;
            boolean isEnd = (i==0) || (i==numRows-1);
            if(isEnd){
                while(nextIndex<length){
                    currentIndex =  nextIndex;
                    nextIndex = nextIndex + multiplier;
                    newStrA[index++] = s.charAt(currentIndex);
                }    
            }else{
                int previousIndex = -i;
                int rotation = 0;
                while(nextIndex<length){
                    currentIndex = multiplier*(rotation++) - previousIndex;
                    nextIndex = previousIndex + multiplier;
                    previousIndex = currentIndex;
                    newStrA[index++] = s.charAt(currentIndex);
                }
            }
        }
        return String.valueOf(newStrA);
    }
}
