#include<iostream>
using namespace std;
int main()
{
  int i=1,n,t1=0,t2=1,nt;
  cin>>n;
  while(i<n-1)
  {
    nt=t1+t2;
    t1=t2;
    t2=nt;
    i++;
  }
  cout<<nt;
}