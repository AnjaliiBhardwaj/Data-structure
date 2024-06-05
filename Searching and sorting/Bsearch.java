class Bsearch{
    public static int search(int []nums, int target) {
        // Write your code here.
        int s=0;
        int e=nums.length -1;
        int mid=s+(e-s)/2; 

        while(s<=e){
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }
}
