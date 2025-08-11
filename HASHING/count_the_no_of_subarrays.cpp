#include <bits/stdc++.h>
using namespace std;

int countSubarraysEqual01(vector<int>& arr) {
    unordered_map<int, int> prefixFreq; 
    int prefixSum = 0;
    int count = 0;

    prefixFreq[0] = 1;
    for (int num : arr) {
        if (num == 0) num = -1;
        prefixSum += num;

        if (prefixFreq.find(prefixSum) != prefixFreq.end()) {
            count += prefixFreq[prefixSum];
        }
        prefixFreq[prefixSum]++;
    }
    return count;
}

int main() {
    vector<int> arr = {0, 0, 1, 0, 1, 1, 0};
    cout << "Number of subarrays with equal 0s and 1s: "
         << countSubarraysEqual01(arr) << endl;
    return 0;
}
