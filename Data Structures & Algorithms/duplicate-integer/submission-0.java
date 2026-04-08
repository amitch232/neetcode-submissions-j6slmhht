class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            }
            map.put(nums[i], map.get(nums[i]) == null ? 1 : map.get(nums[i]) + 1);
        }
        return false;
    }
}