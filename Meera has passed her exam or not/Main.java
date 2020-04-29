#include<iostream>
int main()
{
  int n,reg,i,p=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cin>>reg;
  for(i=0;i<n;i++){
    if(reg==a[i]){
    p=1;
      break;
    }
  }
    if(p)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}