class Solution{
    public int longestConsecutive (int [] nums) {
        int longest=0;

        HashSet<Integer> set = new HashSet<>();

        for(int digit:nums){
            set.add(digit);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;

                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                longest = Math.max(longest,count);

            }
        }

        return longest;
    }

}