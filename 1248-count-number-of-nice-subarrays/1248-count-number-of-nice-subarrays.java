class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
    }
    public int fun(int[] nums,int k){
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum+=(nums[r]%2);
            while(sum>k){
                sum-=(nums[l]%2);
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}