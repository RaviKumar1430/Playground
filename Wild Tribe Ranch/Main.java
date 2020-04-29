#include<iostream>
int main(){
  int x,y;
  std::cin>>x>>y;
  if(x>y)
    std::cout<<"Yes, you can enter.";
  else if(x<y)
    std::cout<<"Sorry, you can't enter";
  else
    std::cout<<"Yes, you can enter. Kindly use a rope.";
}