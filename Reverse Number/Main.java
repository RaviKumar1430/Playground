#include <iostream>
int main() 
{
  int n,r,rn;
  std::cin>>n;
  while(n!=0)
  {
    r=n%10;
    rn=rn*10+r;
    n=n/10;
  }
  std::cout<<rn;
  return 0;
}