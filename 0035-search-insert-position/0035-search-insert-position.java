class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        int max=nums[0];
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                result = i;
            }else if(target>nums[i]){
                max = nums[i];
                result = i+1;
            }else{
                break;
            }
        }
        return result;
    }
}