#include <iostream>
using namespace std;

int factorial(int n) {
    // base case
    if (n == 0 || n == 1)
        return 1;

    // recursive call
    return n * factorial(n - 1);
}

int main() {
    int num = 5;
    cout << "Factorial of " << num << " is: " << factorial(num);
    return 0;
}
