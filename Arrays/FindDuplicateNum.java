// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums
class FindDuplicateNum{
    public int findDuplicate(int[] nums) {

        //O(n)*2
        // int n=nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;

        //T.c-> O(nlog(n)+n)
        //S.c-> O(1)
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;

        //T.c-> O(n)
        //S.c-> O(n)
        // HashSet<Integer> set=new HashSet<>();
        // for(Integer ele: nums){
        //     if(set.contains(ele)){
        //         return ele;
        //     }
        //     set.add(ele);
        // }
        // return -1;


    }
}