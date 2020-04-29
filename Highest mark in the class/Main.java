#include<iostream>
int main()
{
  int n,i,max;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  max=a[0];
  for(i=0;i<n;i++)
  {
    if(max<a[i])
      max=a[i];
  }
      std::cout<<max;
}