#include <bits/stdc++.h>
using namespace std;

int main() {
    int n = 5;

   
    for (int i = 1; i <= n; i++) {
      
        for (int s = 1; s <= n - i; s++) cout << " ";

        for (int j = 1; j <= i; j++) cout << j;

        for (int j = i - 1; j >= 1; j--) cout << j;

        cout << endl;
    }

    for (int i = n - 1; i >= 1; i--) {
        
        for (int s = 1; s <= n - i; s++) cout << " ";

        for (int j = 1; j <= i; j++) cout << j;

        for (int j = i - 1; j >= 1; j--) cout << j;

        cout << endl;
    }

    return 0;
}
