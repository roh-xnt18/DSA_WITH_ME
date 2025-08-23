#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n; 
    
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    unordered_map<int, int> freq;

    for (int x : arr) {
        freq[x]++;
    }

    cout << "Element frequencies:\n";
    for (auto &p : freq) {
        cout << p.first << " -> " << p.second << "\n";
    }

    return 0;
}

