#include <bits/stdc++.h>
using namespace std;

int main() {
    vector<pair<int,int>> arr = {{1,5}, {2,3}, {4,2}, {6,1}};
    
   
    sort(arr.begin(), arr.end(), [](pair<int,int>& a, pair<int,int>& b) {
        return a.second < b.second;
    });
    
    cout << "Pairs sorted by second element:\n";
    for (auto &p : arr) {
        cout << "(" << p.first << "," << p.second << ") ";
    }
    cout << endl;
    return 0;
}
