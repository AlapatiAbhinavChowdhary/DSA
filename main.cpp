#include<bits/stdc++.h>
using namespace std;
void update(int *p){
    *p=10;
    cout<<*p<<endl;
}
int main(){
    int a=20;
    cout<<a<<endl;
    update(&a);
    cout<<a<<endl;
    a=50;
    cout<<a;
}

// int main(){
//     int a=20;
//     int *p=&a;
//     cout<<p<<endl;
//     cout<<*p<<endl;
//     cout<<&p<<endl;
//     cout<<&a<<endl;
// }