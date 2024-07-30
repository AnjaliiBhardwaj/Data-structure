// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

// Return the minimized largest sum of the split.

// A subarray is a contiguous part of the array.

// -----------------------------Similar to book allocation problem------------------------------
import java.util.*;
class SplitArrayLargestSum{
    public boolean isValid(int nums[],int k, int n, int mid){
        int currSum=0;
        int count=1;
        for(int i=0;i<n;i++){
            if(currSum+nums[i]<=mid){
                currSum+=nums[i];
            }
            else{
                count++;
                if(count>k || nums[i]>mid){
                    return false;
                }
                else{
                    currSum=nums[i];
                }
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxi=Math.max(maxi,nums[i]);
        }
        int s=maxi;
        int e=sum;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(isValid(nums, k, nums.length, mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
}