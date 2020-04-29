#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int x,R,y;
  float i,a,d,f;
  cin>>x>>R>>y;
  i=(R*x*y)/100;
  a=x+i;
  d=(i*2)/100;
  f=a-d;
  cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
}