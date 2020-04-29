#include<iostream>
using namespace std;
int reqbact(int);
int main()
{
  int m,n,req,r;
  cin>>m>>n>>req;
  r=m*m*m;
  if(req<=r)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
    