#include<iostream>
using namespace std;
int main()
{
  int hrs[7],res=0,i,thrs=0;
  for(i=0;i<7;i++)
  	std::cin>>hrs[i];
  for(i=0;i<7;i++)
  {
  	res=res+(hrs[i])*100;
    thrs=thrs+hrs[i];
  }
  for(i=0;i<7;i++)
  {
    if(hrs[i]>8)
      res=res+((hrs[i]-8)*15);
  }
  res=res+(hrs[0]*50);
  res=res+(hrs[6]*25);
  std::cout<<res<<"\n";
}