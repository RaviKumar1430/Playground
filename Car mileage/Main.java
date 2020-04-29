#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,d;
  cin>>m>>p>>d;
  if(m*p>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}