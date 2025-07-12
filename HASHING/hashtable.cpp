#include <iostream>
#include <list>
using namespace std;

class HashTable {
    int BUCKET;               
    list<int>* table;      

public:
 
    HashTable(int size) {
        BUCKET = size;
        table = new list<int>[BUCKET];
    }

    int hashFunction(int key) {
        return key % BUCKET;
    }

    void insert(int key) {
        int index = hashFunction(key);
        table[index].push_back(key);
    }

    void remove(int key) {
        int index = hashFunction(key);
        table[index].remove(key);
    }

    void display() {
        for (int i = 0; i < BUCKET; i++) {
            cout << "Bucket " << i << ": ";
            for (auto x : table[i])
                cout << x << " -> ";
            cout << "NULL\n";
        }
    }
};

int main() {
    HashTable h(7); 

    h.insert(10);
    h.insert(20);
    h.insert(15);
    h.insert(7);
    h.insert(22);

    cout << "Initial hash table:\n";
    h.display();

    h.remove(15);
    cout << "\nAfter deleting 15:\n";
    h.display();

    return 0;
}
