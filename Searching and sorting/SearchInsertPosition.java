class SearchInsertPosition{
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int mid=s+(e-s)/2;

        while(s<=e){
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                s=mid+1;
            }
            if(nums[mid]>target){
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        //If the loop terminates without finding the target, it
//means the left pointer has moved to the position where
//the target should be inserted to maintain the sorted
//order of the array.
        return s;
    }

}