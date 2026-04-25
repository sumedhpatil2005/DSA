#include<iostream>
using namespace std;
int count =0;
void f(){
    if(count ==4)  return;
    cout<<"F";
    count++;
    f();
}

int main(){
    f();
return 0;
}