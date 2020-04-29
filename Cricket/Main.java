#include<iostream>
using namespace std;
int main()
{
  int tb,tr,rs,bf;
  cin>>tb>>tr>>rs>>bf;
  float tot=tb/6;
  float ovf=(bf/6)+(bf%6)*0.1;
  float crr=(float)((int)((rs/ovf)*10+0.5))/10;
  float trr=(float)((int)((tr/tot)*10+0.5))/10;
  cout<<tot<<"\n";
  cout<<ovf<<"\n";
  cout<<crr<<"\n";
  cout<<trr<<"\n";
  if(crr>trr)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
  
}