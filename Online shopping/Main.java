#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,ff,sf,af;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  ff=fa-fa*fd/100+fs;
  sf=sa-sa*sd/100+ss;
  af=aa-aa*ad/100+as;
  cout<<"In Flipkart Rs."<<ff<<"\n"<<"In Snapdeal Rs."<<sf<<"\n"<<"In Amazon Rs."<<af<<"\n";
  if(ff<=sf&&ff<=af)
    cout<<"He will prefer Flipkart";
  else if(sf<=ff&&sf<=af)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}