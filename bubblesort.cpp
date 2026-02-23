#include<iostream>
using namespace std;
int main(){
    int arr[] = {1,2,3,4,5,6};
    int n=6;
    bool swapcount = false;
    for(int i=1;i<n-1;i++){
        for(int j=1;j<n-i;j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
                swapcount = true;
            }
        }
        if(swapcount==false){
            printf("sorted only");  
            break;
          
        }
    }
     
}