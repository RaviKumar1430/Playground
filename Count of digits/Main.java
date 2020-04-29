#include<iostream>
int main()
{
  int n,count;
  std::cin>>n;
  do{
    n=n/10;
    count++;
  }while(n!=0);
  std::cout<<count;
}