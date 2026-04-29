#include<iostream>
using namespace std;

  int i=0;
       int sumof = 0;
int sum(int n,int arr[]){
   
    if(i>n) {cout<<sumof;}
    else{
    sumof += arr[i];
    i++;
    sum(n,arr);
} }


int main(){

    int arr[] = {1,2,3,4,5,6,7};
    int n=5;
    sum(n,arr);
}