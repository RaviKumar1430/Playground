#include<iostream>
using namespace std;
int main()
{
  float x1,y1,x2,y2,x3,y3,x,y;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  x=float((x1+x2+x3)/3);
  y=float((y1+y2+y3)/3);
  cout<<x<<"\n"<<y;
}