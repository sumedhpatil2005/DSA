#include <iostream>
using namespace std;
void printname(int n,int i){
    if(i>n) return;
    cout<<"name";
    
    printname(n,i+1);

}

int main(){
    int n=0,i=1;
    cout<<"Enter the times you want name to be printed :";
    cin>>n;
    printname(n,i); 

}