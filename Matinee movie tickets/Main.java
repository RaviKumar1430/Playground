#include<iostream>
using namespace std;
int main()
{
  int a;
  double st;
  cin>>a>>st;
  if(a>=13)
  {
    if(st==13.30)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  else
  {
    if(st==13.30)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
}