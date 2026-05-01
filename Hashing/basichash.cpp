#include<iostream>
using namespace std;



int main(){

    int arr1[14]={1,2,3,4,5,6,4,555,444,333,333,333,444,3};

    int n=14;
    int hash[1000]={0};

    for(int i =0;i<n;i++){
        hash[arr1[i]]++;

    }
    for(int i=0;i<n;i++){
        if(hash[i]>0){
            cout<<i<<"appears  "<<hash[i]<<"times";
            cout<<endl;
        }
    }
}