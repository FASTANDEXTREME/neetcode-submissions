class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i;
        HashSet<Integer> map = new HashSet<>();

        for(i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                return true;
            }
            else{
                map.add(nums[i]);
            }
        }
        return false;
        
    }
}