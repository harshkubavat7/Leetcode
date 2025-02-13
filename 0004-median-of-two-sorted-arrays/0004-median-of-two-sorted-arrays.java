// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n=nums1.length;
//         int m=nums2.length;
//         int ar[]=new int[m+n];
//         int i=0,j=0,k=0;
//         while(i<n && j< m)
//         {
//             if(nums1[i]<nums2[j])
//             {
//                 ar[k]=nums1[i];
//                 i++;
//             }
//             else{
//                 ar[k]=nums2[j];
//                 j++;
//             }
//             k++;

//         }    
//         while(i<n)
//         {
//             ar[k]=ar[i];
//             i++;
//             k++;
//         }
//         while(j<m)
//         {
//             ar[k]=ar[j];
//             j++;
//             k++;
//         }
//         if((m+n)%2!=0)
//         {
            
//             return ar[(m+n)/2];
//         }
//         else{
//             int c=(m+n)/2;
//            double p = ar[c];//1,2,3,4,5,6,7,8,9,10
//             double q= ar[c-1];//index start with 0
//             return (p+q)/2;
//         }
//     }
// }

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ar = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                ar[k] = nums1[i];
                i++;
            } else {
                ar[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements from nums1, if any
        while (i < n) {
            ar[k] = nums1[i];
            i++;
            k++;
        }
        
        // Copy remaining elements from nums2, if any
        while (j < m) {
            ar[k] = nums2[j];
            j++;
            k++;
        }

        // Find the median
        int totalLength = m + n;
        if (totalLength % 2 != 0) {
            return ar[totalLength / 2];
        } else {
            int mid1 = totalLength / 2;
            int mid2 = mid1 - 1;
            return (ar[mid1] + ar[mid2]) / 2.0;
        }
    }
}
