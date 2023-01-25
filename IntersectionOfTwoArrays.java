class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        TreeSet<Integer> set = new TreeSet<>();
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else if(nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[set.size()];
        int count = 0;
        for(int ele : set) {
            res[count] = ele;
            count++;
        }

        return res;
    }
}
