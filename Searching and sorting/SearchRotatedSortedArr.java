class SearchRotatedSortedArr{
    // Function to find the pivot point where the array is rotated
    public int pivot(int [] nums, int s, int e,int mid){
        while(s<e){
            // If mid element is greater than or equal to the first element, pivot is in the right half
            if(nums[mid]>=nums[0]){
            s=mid+1;
        }
        else{
             // Otherwise, pivot is in the left half
            e=mid;
        }
        mid=s+(e-s)/2;
        
        }
        return s;
        
    }
    // Function to perform binary search on the given subarray
    public int binarySearch(int[] nums, int target,int s, int e){
        int mid=s+(e-s)/2;
        while(s<=e){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }
     // Main function to search the target in a rotated sorted array
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n==0){
            return -1;
        }
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;
        int piv=pivot(nums, s, e, mid);
       
        // If the array is not rotated or target is in the left sorted part
        if(target>=nums[piv] && target<=nums[e]){
            return(binarySearch(nums,target, piv, e));
        }
        // If target is in the right sorted part
        else{
            return(binarySearch(nums, target, 0 ,piv-1));
        }
    }
}