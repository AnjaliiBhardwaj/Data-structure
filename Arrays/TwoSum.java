class TwoSum {
//     Time Complexity: O(n log n)
//     Space Complexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        // int arr[]=nums.clone();
        // Arrays.sort(arr);
        // int s=0;
        // int e=arr.length-1;
        // int num1=0;
        // int num2=0;
        // while(s<e){
        //     int sum=arr[s]+arr[e];
        //     if(sum==target){
        //         num1=arr[s];
        //         num2=arr[e];
        //         break;
        //     }
        //     if(sum<target){
        //         s++;
        //     }
        //     else{
        //         e--;
        //     }
            
        // }

        // int ans[]=new int[2];
        // boolean flag= false;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==num1 && !flag){
        //         ans[0]=i;
        //         flag=true;
        //     }
        //     else if(nums[i]==num2){
        //         ans[1]=i;
        //     }
        // }
        // return ans;

        //time comp-> O(n)
        //space ->O(n)
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sub=target-nums[i];
            if(map.containsKey(sub)){
                //if target-curr ele result is present in map , return the index of that ie value,and current index
                return new int[]{map.get(sub),i};
            }
            //else add ele in hashmap
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}