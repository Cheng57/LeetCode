class Solution {
    public int[] runningSum(int[] nums) {
        int i = 0;
        int[] rslt = new int[nums.length];
        while (i < nums.length){
            if (i == 0) {
                rslt[i] = nums[i];
            } else {
                rslt[i] = nums[i] + rslt[i-1];
            }
            i = i + 1;
        }
        return rslt;
    }
}