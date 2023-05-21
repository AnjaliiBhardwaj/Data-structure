#include <iostream>
#include <stack>

using namespace std;
int main(){
    stack <string> s;
    s.push("Anjali");
    s.push("Bhardwaj");
    s.push("Hii");

    cout<<"Top ele: "<<s.top()<<endl;
    s.pop();
    cout<<"Top ele: "<<s.top()<<endl;

    cout<<"size of stack: "<<s.size()<<endl;
}