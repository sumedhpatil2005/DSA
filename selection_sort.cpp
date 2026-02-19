#include<iostream>
using namespace std;

int main(){
    int arr[]={3,2,4,6,5};
    int n=5;
    int minindex=0;
    for(int i=0;i<n-1;i++ ){
        minindex = i;
        for(int j=i+1;j<=n;j++){
            if(arr[minindex]>arr[j]){
                minindex = j;
            }
        }
        swap( arr[minindex],arr[i]);
    }
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}