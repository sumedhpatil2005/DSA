#include<iostream>
using namespace std;

int main(){
    string s= "abcdaa";
    int hash[26]={0};

    for(int i=0;i<s.length();i++){
        hash[s[i]-'a']++;
    }
    for(int i =0;s.length();i++){
        cout<<hash[i]<<endl;
    }
}