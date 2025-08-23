#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;  // size of array
    
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int maxi = arr[0], mini = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > maxi) maxi = arr[i];
        if (arr[i] < mini) mini = arr[i];
    }

    cout << "Maximum: " << maxi << "\n";
    cout << "Minimum: " << mini << "\n";

    return 0;
}
