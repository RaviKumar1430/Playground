#include<iostream>
using namespace std;
int main()
{
  int i;
  float ht;
  cin>>i>>ht;
  if(i<=3)
  {
    if(i==2)
      cout<<ht*50/100+ht;
    else
      cout<<ht*2;
  }
  else
    cout<<"Number of items is more";
}