class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            if (vowels.indexOf(arr[left]) != -1 && vowels.indexOf(arr[right]) != -1) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (vowels.indexOf(arr[left]) != -1) {
                right--;
            } else if (vowels.indexOf(arr[right]) != -1) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
