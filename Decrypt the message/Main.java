#include<iostream>
int main(){
  int e,t,c,x;
  std::cin>>e>>t;
  x=e+t;
  for(int i=1;i<x;i++){
    if(x%i==0)
      c=c+i;
  }
    if(c==x)
      std::cout<<"They can read the message";
    else
      std::cout<<"They can't read the message";
}