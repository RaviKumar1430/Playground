#include <iostream>
using namespace std;
int Power(int, int);
int main()
{
    int a, n, res;
    cout << "Enter the value of a"<<"\n";
    cin >> a;
    cout << "Enter the value of n"<<"\n";
    cin >> n;
    res = Power(a, n);
    cout <<"The value of "<<a<<" power "<<n<<" is "<<res;
    return 0;
}
int Power(int base, int powerRaised)
{
    if (powerRaised != 0)
        return (base*Power(base, powerRaised-1));
    else
        return 1;
}