#include<bits/stdc++.h>
using namespace std;

int fib(int n){
    if(n<=1)
    return n;
    int last = fib(n-1);
    int slast = fib(n-2);
    return last + slast;
}

int main () {
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif
    cout<<fib(4);
    return 0;
}