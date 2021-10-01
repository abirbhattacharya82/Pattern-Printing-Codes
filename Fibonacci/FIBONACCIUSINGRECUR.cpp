#include<iostream>
using namespace std;

int fib(int n)
{
    if(n==0 || n==1) return n;
    return fib(n-1)+fib(n-2);
}

void main()
{  int n;

    cout<<"enter n"<<endl;
    cin>>n;
    int x=fib(n);
    cout<<x;


}