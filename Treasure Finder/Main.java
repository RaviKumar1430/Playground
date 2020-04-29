#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d=1,i=1;
  cin>>a>>b>>c;
  if(a>b&&a>c)
  {
    if(b>c)
    cout<<"The treasure is in box which has number "<<b<<"\n";
    else
      cout<<"The treasure is in box which has number "<<c<<"\n";
  }
  else if(b>a&&b>c)
  {
    if(a>c)
    cout<<"The treasure is in box which has number "<<a<<"\n";
  else
    cout<<"The treasure is in box which has number "<<c<<"\n";
  }
  else
  {
    if(a>b)
      cout<<"The treasure is in box which has number "<<a<<"\n";
    else
      cout<<"The treasure is in box which has number "<<b<<"\n";
  }
  while(i<=a&&i<=b&&i<=c){
    if(a%i==0&&b%i==0&&c%i==0)
      d=i;
    i++;
}
  cout<<"The code to open the box is "<<d;
}