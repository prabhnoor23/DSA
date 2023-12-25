class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int minSum = 0;

        for(int i = 0; i < nums.length - 2; i ++){

            int left = i + 1;
            int right = n - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < minDiff){
                    minDiff = Math.abs(target - sum);
                    minSum = sum;
                }

                if(sum == target){
                    return sum;
                }
                else if(sum > target){
                    right --;
                }
                else{
                    left ++;
                }

            }
            
        }
        return minSum;
    }
}