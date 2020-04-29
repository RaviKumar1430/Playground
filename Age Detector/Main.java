#include<iostream>
using namespace std;
int main()
{
  int by,py,t;
  cin>>by>>py;
  if(py==00)
    cout<<100-by;
  else
  {
    t=py-by;
    if(t<0)
      t=t+100;
    cout<<t;
  }
}