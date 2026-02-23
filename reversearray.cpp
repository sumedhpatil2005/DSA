#include<iostream>
using namespace std;
#include<vector>


vector<int> reverse(vector<int>&v){
    int s = 0;
    int e = v.size()-1;
    
    while(s<=e){
        swap(v[s],v[e]);
        s++;
        e--;
    
    }
    return v;

}

int main(){
    vector<int> v;
    v.push_back(3);
    v.push_back(5);
    v.push_back(7);
    v.push_back(8);
    v.push_back(9);

    vector<int> ans = reverse(v);
    for(int i=0;i<size(ans);i++){
        printf("%d",ans[i]);
    }
}