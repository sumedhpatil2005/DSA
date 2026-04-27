#include<iostream>
using namespace std;

void backtrack(int n){
    if(n<1) return;
    
    backtrack(n-1);
    cout<<n<<endl;
}

int main(){

    int n=5;
    backtrack(n);
}