class Solution {
//    https://leetcode.com/problems/merge-sorted-array/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums2.length - 1;
        int j = m - 1;
        int k = nums1.length - 1;

        while(i >=0 && j >= 0){

            if(nums1[j] < nums2[i]){

                nums1[k--] = nums2[i--];


            } else if (nums1[j] > nums2[i]){

                nums1[k--] = nums1[j--];
            }
            else {
                nums1[k--] = nums2[i--];
                nums1[k--] = nums1[j--];
            }

        }

        while(i >= 0){

            nums1[k--] = nums2[i--];
        }
    }
}