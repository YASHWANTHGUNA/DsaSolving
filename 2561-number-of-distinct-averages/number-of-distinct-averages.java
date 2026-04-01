class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        Set<Integer> set = new HashSet<>();

        while (left < right) {
            int sum = nums[left] + nums[right];
            set.add(sum);
            left++;
            right--;
        }

        return set.size();
        
    }
}