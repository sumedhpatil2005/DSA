#include<iostream>
using namespace std;

void revarr(int arr[],int i,int j){
    if(i>j) return ;
    int temp = arr[i];
     arr[i] = arr[j];
    arr[j] = temp;

    revarr(arr,i+1,j-1);
}


int main(){

    int arr[5] = {1,2,3,4,5};       
    int n=5;
    int i=0;
    int j = n-1;
    revarr(arr,i,j);
    for(int i =0;i<n;i++){
        cout<<arr[i];
    }
}