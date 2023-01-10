#include <iostream>
#include <vector>
using namespace std;

void display (vector <int> &v){
    for (int i=0 ; i< v.size();i++){
        cout<< v[i]<< " ";
    }
    cout<< endl;
}
int main(){
    vector <int> vect1;
    int ele, size;
    cout<< " Enter the size" << endl;
    cin>> size;
    
    for (int i=0;i<4;i++){
        cout<< " Enter ele : ";
        cin >> ele;
        vect1.push_back(ele);
    }

    display(vect1);
    return 0;
}