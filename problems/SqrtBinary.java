// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n =10000;
        int start = 1;
        int end = n;
        int mid =0;
        int sqr = 1;
        boolean less = true;
        while(start<=end){
            //System.out.println("start: "+start+" end: "+end + " mid: "+mid);
            mid = (start + end )/2;
            sqr = mid*mid;
            if((sqr)== n){
                //System.out.println("Found");
                break;
            }
        if((sqr)<n){
            //System.out.println("lesd mid :"+mid);
            start = mid +1;
        }else{
            //System.out.println("more mid :"+mid);
            end = mid - 1;
        }
        }
        if(sqr>n){
            
            mid--;
        }
        
        System.out.println(
        mid);
    }
}
