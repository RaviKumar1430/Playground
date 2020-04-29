#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int pos;
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>pos;
  int val;
  if(pos<n)
  cout<<"Enter the value to insert"<<"\n";
  cin>>val;
  for(int i=n;i>=pos-1;i--)
    a[i]=a[i-1];
  a[pos-1]=val;
  if(pos>n)
    cout<<"Invalid Input";
  else{
    cout<<"Array after insertion is"<<"\n";
  for(int i=0;i<n+1;i++)
    cout<<a[i]<<"\n";
  }
}