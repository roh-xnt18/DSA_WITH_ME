#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, int> hashTable;

    // Insert key-value pairs
    hashTable["apple"] = 10;
    hashTable["banana"] = 20;
    hashTable["orange"] = 30;

    // Access values
    cout << "apple: " << hashTable["apple"] << endl;
    cout << "banana: " << hashTable["banana"] << endl;

    // Search for a key
    string key = "orange";
    if (hashTable.find(key) != hashTable.end()) {
        cout << key << " found with value: " << hashTable[key] << endl;
    } else {
        cout << key << " not found!" << endl;
    }

    return 0;
}
