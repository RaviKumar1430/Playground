#include<iostream>
using namespace std;
int main()
{
  string d;
  int r;
  cin>>d>>r;
  if(d=="front")
  {
    if(r==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
}    
  else
  {
    if(r==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
}    
}  