
class Solution {
    public static int[] twoSum(int[] nums, int target) {

        int i;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[]{
                        map.get(required),i
                };
            } else {
                map.put(nums[i], i);
            }

        }
        return new int[]{};
        
    }
}
