#include<iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
  
    print(n);
}

void print(int n){
    if (n==1)
    {
        cout << n <<" ";
        return;
    }
    print(n-1);
    cout<<n<<" ";
}