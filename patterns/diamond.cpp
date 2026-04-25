#include<iostream>
using namespace std;

void pyramid1(int n){

    // Top part
    for(int i=0;i<n;i++){

        for(int j=0;j<n-i-1;j++){
            cout<<" ";
        }

        for(int j=0;j<2*i+1;j++){
            cout<<"*";
        }

        cout<<endl;
    }

    // Bottom part
    for(int i=0;i<n-1;i++){

        for(int j=0;j<i+1;j++){
            cout<<" ";
        }

        for(int j=0;j<2*n-(2*i+3);j++){
            cout<<"*";
        }

        cout<<endl;
    }
}

int main(){
    pyramid1(4);
}