/*Question Number: 852
Level: Medium
Topic Covered:Array,Binary
Date: 24th April 2026
 */
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid =end/2;
        while(!(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])){
            if(arr[mid]<arr[mid-1]){
                end=mid;
                mid=(start+end)/2;
            }
            else{
                start=mid;
                mid=(start+end)/2;
            }
        }
        return mid;
    }
}
