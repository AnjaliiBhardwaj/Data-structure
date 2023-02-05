#include <bits/stdc++.h>
#include <iostream>
using namespace std;
class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int left = 0, right = nums.size() - 1;
        sort (nums.begin(),nums.end());
        while(left<right){
            if(nums[left]%2==0 ){
                left++;
            }
            else if(nums[right]%2!=0){
                right--;
            }
            else{
            swap(nums[left],nums[right]);
            left++;
            right--;
            }
        }
        return nums;
    }
};