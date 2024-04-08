//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int size=Math.min(nums1.length,nums2.length);
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        int temp[]=new int[size];
        // int i=0,j=0,count=0;

        // while(i<nums1.length && j<nums2.length){
        //     if(nums1[i]<nums2[j]){
        //         i++;
        //     }
        //     else if(nums2[j]<nums1[i]){
        //         j++;
        //     }
        //     //found duplicate
        //     else{
        //         temp[count]=nums1[i];
        //         count++;
        //         i++;
        //         j++;
        //     }
             
        // } 
        // return Arrays.copyOf(temp,count);

        //Using hashMap
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }

        }
        int count=0;
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                temp[count++]=nums2[i];
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }

        return Arrays.copyOf(temp,count);
}
}