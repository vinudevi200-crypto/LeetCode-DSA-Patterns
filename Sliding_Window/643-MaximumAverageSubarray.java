class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        double final_sum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            final_sum=Math.max(final_sum,sum);
        }

        return final_sum/k;
    }
}
