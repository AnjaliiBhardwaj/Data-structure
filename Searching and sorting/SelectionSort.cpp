#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        for(int i=0;i<nums.size();i++){
            int minIndex=i;
            for(int j=i+1;j<nums.size();j++){
                if(nums[j]<nums[i]){
                    minIndex=j;
                }
            }
            swap(nums[minIndex],nums[i]);
        }
    }
};