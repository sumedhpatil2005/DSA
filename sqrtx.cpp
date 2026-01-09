class Solution {
public:
    int mySqrt(int x) {
        int ans = -1;
        int s = 0;
       long long int e = x;
       long long int mid = s + (e-s)/2;

        while(s<=e){
           long long int square = mid*mid;
            if(square == x){
                return mid;
            }
            else if(square < x){
                ans=mid;
                s = mid+1;
            }
            else{
                e = mid -1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
      
    }
};