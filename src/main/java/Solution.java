class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int start = 0;
        int count = 0;
        boolean zero = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                res = Math.max(res, count);
            }else{
                if(!zero) {
                    zero = true;
                }else {
                    while(start < i && zero) {
                        if(nums[start] == 0) {
                            zero = false;
                        }else count--;

                        start++;
                    }
                    zero = true;
                }
            }
        }

        return res == nums.length ? res - 1 : res;
    }
}