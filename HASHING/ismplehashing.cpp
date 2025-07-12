#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
  
    unordered_map<string, int> map;

    map["apple"] = 10;
    map["banana"] = 20;
    map["orange"] = 30;

    cout << "Value for key 'banana': " << map["banana"] << endl;

    if (map.find("apple") != map.end()) {
        cout << "Key 'apple' found with value: " << map["apple"] << endl;
    }

    map.erase("orange");

    cout << "Current HashMap contents:" << endl;
    for (auto pair : map) {
        cout << pair.first << " => " << pair.second << endl;
    }

    return 0;
}
