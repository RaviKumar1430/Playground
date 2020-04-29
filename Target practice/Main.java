#include<iostream>
using namespace std;
int main()
{
  int num,sum=0,count=0,n;
  cin>>num;
  while(sum<num)
  { 
    cin>>n;
    sum=sum+n;
    count++;
  }
  cout<<"The number of turns is "<<count;
}