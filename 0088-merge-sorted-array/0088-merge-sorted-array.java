class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // pointer for nums1
        int j = n - 1;       // pointer for nums2
        int k = m + n - 1;   // pointer for placement in nums1

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];   // take from nums1
            } else {
                nums1[k--] = nums2[j--];   // take from nums2
            }
        }

        // Copy remaining nums2 elements (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
