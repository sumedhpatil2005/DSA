    #include<iostream>
    using namespace std;

    int firstocc(int arr[],int n,int k){
        int s=0;int e=n-1;
        int ans=-1;
        int mid = s + (e-s)/2;
        while(s<=e){
            if(arr[mid]==k){
                ans=mid;
                e=mid-1;
            }
            else if(k>arr[mid]){
                s = mid+1;
            }
            else if(k<arr[mid]){
                e=mid-1;
            }
            mid = s +(e-s)/2;
        }
        return ans;
    }

    int lastocc(int arr[],int n ,int k){

        int s = 0, e = n-1;
        int ans = -1;
        int mid = s + (e-s)/2;

        while(s<=e){
            if(arr[mid]==k){
                ans = mid;
                s = mid+1;

            }
            else if(arr[mid]<k){
                e = mid-1;

            }
            else if(arr[mid]>k){
                s=mid+1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    int main(){
        int arr[5] ={1,3,3,3,5};
        cout<<firstocc(arr,5,3);
        cout<<lastocc(arr,5,3);
        
        return 0;
    }