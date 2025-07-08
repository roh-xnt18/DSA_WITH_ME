#include<bits/stdc++.h>
using namespace std;
void printf(int ind, vector<int> &ds, int arr[], int n){
    if(ind == n){
        for(auto it : ds){
            cout<< it <<" ";
        }
        if(ds.size() == 0){
            cout<<"{}";
        }
        cout<<endl;
        return;
    }

    printf(ind+1, ds, arr, n);
    ds.push_back(arr[ind]);
    printf(ind+1, ds, arr, n);
    ds.pop_back();
    
}

int main(){
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif
    int arr[] = {3, 1, 2};
    int n = 3;
    vector<int>ds;
    printf(0, ds, arr, n);
    return 0;
}