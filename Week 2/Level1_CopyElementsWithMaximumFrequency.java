class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] freq = new int[101];
        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;

            if (freq[nums[i]] > max) {
                max = freq[nums[i]];
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == max) {
                count = count + freq[i];
            }
        }

        return count;
    }
}
