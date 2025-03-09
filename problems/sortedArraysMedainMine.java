class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        boolean first = true;
        boolean second = true;
        int total = nums1Length + nums2Length;
        int median = total/2;
        int medianValue = 0;
        int prevmedian = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        double result = 0.0;
        if(nums1Length > 0 && nums2Length>0){
        for(int i=0;i<=median;i++){
            if((nums1[firstIndex] <= nums2[secondIndex]) ){
                if(first){
                    prevmedian = medianValue;
                    medianValue = nums1[firstIndex++];
                    if(firstIndex >  (nums1Length -1)) {
                        first = false;
                        firstIndex--;
                    }
                }else{
                    prevmedian = medianValue;
                    medianValue = nums2[secondIndex++];
                }
            }else{
                if(second){
                    prevmedian = medianValue;
                    medianValue = nums2[secondIndex++];
                    if(secondIndex > (nums2Length -1)) {
                        second = false;
                        secondIndex--;
                    }
                }else{
                    prevmedian = medianValue;
                    medianValue = nums1[firstIndex++];
                }
            }            
        }
        }else{
            int[] medianArray = nums1Length>0 ? nums1 : nums2;
            if(total%2==0){
                prevmedian = medianArray[median-1];
            }
            medianValue = medianArray[median];
            

        }

        if(total % 2 == 1){
                result = medianValue;
        }
        else {
            result = (medianValue + prevmedian);
            result = result/2;
        }
        return result;
        
    }
}
