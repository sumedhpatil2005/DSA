#include<iostream>
#include<map>
using namespace std;

int main(){
    int n=6;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }


    map<int,int>mpp;
    for(int i=0;i<n;i++){
        mpp[arr[i]]++;
    }
    
    
    for(int i=0;i<n;i++){
        cout<<i<<"occurus"<<mpp[i]<<"times"<<endl;
    }


}