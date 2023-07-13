class Solution {
    public int search(int[] nums, int target) {
        int targetIndex = -1;
        int bottomIndex = 0;
        int topIndex = nums.length - 1;
        while(bottomIndex <= topIndex){
            int middleIndex = bottomIndex + (topIndex - bottomIndex)/2;
            int num = nums[middleIndex];
            if(num == target){
                targetIndex = middleIndex;
                break;
            }
            if(num > target){
                topIndex = middleIndex - 1;
            }else{
                bottomIndex = middleIndex + 1;
            }
        }
        return targetIndex;
    }

}