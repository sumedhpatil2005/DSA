#include<iostream>
using namespace std;

int triangle(int n){
int stars=0;
    for(int i =1;i<2*n-1;i++){
        stars= i;
        if(i>n) stars = 2*n-i;

        for(int j=1;j<stars;j++ ){
            printf("*");
        }
        cout<<endl;

    }
}

int main(){
    triangle(5);

}