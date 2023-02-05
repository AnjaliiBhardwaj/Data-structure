#include <bits/stdc++.h>
using namespace std;
class Solution {
public: 
    int fstPosition(vector <int>& nums, int target){
        int start=0;
        int end=nums.size() -1;
        int fstPos=-1;
        int mid = start + (end-start)/2;

        while(start<=end){
            mid= start + (end-start)/2;
            if(nums[mid]==target){
                end=mid-1;
                fstPos= mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return fstPos;
    }

    int lastPosition (vector <int>& nums, int target, int val1){
        int start=val1;
        int end=nums.size() -1;
        int LastPos=-1;
        int mid = start + (end-start)/2;

        while(start<=end){
            mid= start + (end-start)/2;
            if(nums[mid]==target){
                start=mid+1;
                LastPos= mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return LastPos;
    }
    vector<int> searchRange(vector<int>& nums, int target) {

        vector<int> vct;
        int val1=fstPosition(nums, target);
        int val2=lastPosition(nums, target, val1);

        vct.push_back(val1);
        vct.push_back(val2);

        return vct;
    }
};
