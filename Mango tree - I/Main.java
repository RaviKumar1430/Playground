#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  std::cin>>r>>c>>n;
  if((n<=r)||(n%5==0)||(n%5==1)||(n<=c))
    std::cout<<"Yes";
  else 
    std::cout<<"No";
}