#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
int main(){
    vector <int> v;
    v.push_back(4);
    v.push_back(9);
    v.push_back(11);

    //Return 1,0 for that ele to find out
    std::cout<<"Find 8: "<<binary_search(v.begin(),v.end(),8)<<endl;

    std::cout<<"lower bound: "<<lower_bound(v.begin(),v.end(),20) - v.begin()<<endl;
    std::cout<<"Upper bound: "<<upper_bound(v.begin(),v.end(),20)-v.begin()<<endl;
    
    //max
    int a=6;
    int b=9;
    std::cout<<"max-> "<<max(a,b)<<endl;

    //min
    std:: cout<<"Min-> "<<min(a,b)<<endl;
    
    //swap number
    swap(a,b);
    std::cout<<"a: "<<a<<endl;
    
    //reverse a string
    string abcd="adbd";
    reverse(abcd.begin(),abcd.end());
    std::cout<<"String-> "<<abcd<<endl;

    //rotate array(have to pass start mid end elements)
    rotate(v.begin(),v.begin()+1,v.end());
    std::cout<<"after rotate"<<endl;
    for(int i:v){
        std::cout<<i<<" ";
    }

    //based on intro sort (combination of quick ,geek, insertion sort)
    sort(v.begin(),v.end());
    std::cout<<"after sort"<<endl;
    for(int i:v){
        std::cout<<i<<" ";
    }

}