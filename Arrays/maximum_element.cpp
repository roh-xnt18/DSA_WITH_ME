#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cout << "Enter size of array: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) cin >> arr[i];

    int maxi = arr[0]; 
    for (int i = 1; i < n; i++) {
        if (arr[i] > maxi) {
            maxi = arr[i];
        }
    }

    cout << "Maximum element is: " << maxi << endl;
    return 0;
}
