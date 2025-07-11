#include <iostream>
#include <vector>
using namespace std;

void findSubsets(vector<int>& arr, int index, vector<int>& current, int target) {
    if (index == arr.size()) {
        if (target == 0) {
            for (int num : current) {
                cout << num << " ";
            }
            cout << endl;
        }
        return;
    }

    current.push_back(arr[index]);
    findSubsets(arr, index + 1, current, target - arr[index]);

    current.pop_back();

    findSubsets(arr, index + 1, current, target);
}

int main() {
    vector<int> arr = {1, 2, 3};
    int k = 3;
    vector<int> current;
    findSubsets(arr, 0, current, k);
    return 0;
}
