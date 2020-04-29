#include<iostream>
using namespace std;
int main()
{
int n;
cin>>n;
int a[n],e=0;
for(int i=0;i<n;i++)
{
cin>>a[i];
}
cout<<"1"<<"\n";
for(int i=1;i<n;i++)
{
if(a[i]>a[i-1])
{
e=e+2;
cout<<e<<"\n";
}
else
cout<<"1"<<"\n";
}
}