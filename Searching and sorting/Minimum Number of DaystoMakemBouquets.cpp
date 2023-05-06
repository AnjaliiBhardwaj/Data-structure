#include<bits/stdc++.h>;
using namespace std;
class Solution {
public:

bool isPossible(vector<int>& bloomDay, int m, int k,int mid){
    int fcount=1;
    int dsum=0;
    for(int i=0;i<m;i++){
        if(bloomDay[i]+ dsum<=mid){
            dsum+=bloomDay[i];
        }
        else{
            fcount++;
            if(bloomDay[i]>mid || fcount > k || m*k!=bloomDay.size() ){
                return -1;
            }
            dsum=bloomDay[i];
        }
    }
    return true;

}
    int minDays(vector<int>& bloomDay, int m, int k) {
        int s=0;
        int sum=0;
        int ans=0;
        for(int i=0;i<m;i++){
            sum+=bloomDay[i];
        }
        int e=sum;
        int mid=s+(e-s)/2;

        while(s<=e){
            if(isPossible( bloomDay,m,k,mid)){
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
};