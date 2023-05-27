#include <iostream>
#include <queue>

using namespace std;
int main(){
    queue <string> q;
    q.push("Anjali");
    q.push("Bhardwaj");
    q.push("hii");

    cout<<"Size before pop: "<<q.size()<<endl;
    cout<< "First ele: "<<q.front()<<endl;
    q.pop();
    cout<<"First Element: "<<q.front()<<endl;

    cout<<"Size after pop: "<<q.size()<<endl;
}