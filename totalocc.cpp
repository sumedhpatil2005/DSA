#include<iostream>
using namespace std;

int firstocc(int arr[],int n,int k){
    int s = 0,e = n-1;
    int mid = s + (e-s)/2;
    int first=-1;
    while(s<=e){
        if(k==arr[mid]){
            first = mid;
            e=mid-1;
        }
        else if(k<arr[mid]){
            e = mid -1;

        }
        else if(k>arr[mid]){
            s = mid +1;

        }
        mid = s+(e-s)/2;
    }
return first;
}

int lastocc(int arr[],int n,int k){

int last=-1;
int s=0,e=n-1;
int mid = s +(e-s)/2;
while(s<=e){
if(k==arr[mid]){
    s=mid+1;
    last = mid;
}
else if(k<arr[mid]){
    e = mid-1;
}
else if(k>arr[mid]){
    s = mid+1;
}
mid = s+(e-s)/2;
}
return last;
}
int main(){
    int arr[5]={1,3,3,3,3};
    int first = firstocc(arr,5,3);
    int last = lastocc(arr,5,3);
    cout<<"total no. of occurence"<<last - first + 1;

    return 0;
}
