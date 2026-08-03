class Solution {
    public int missingNumber(int[] nums) {
        int sumOfN=0;
        int sum=0;
        for(int i=0; i<=nums.length; i++){
            sum+=i;
        }
        for(int i =0; i<nums.length;i++){
            sumOfN+=nums[i];
        }
        int diff = sum-sumOfN;
        return diff;
    }
}