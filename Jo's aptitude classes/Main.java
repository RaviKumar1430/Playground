#include<iostream>
using namespace std; 
int main() 
{
  int a,b,c,gcd,st,ans;
  cin>>a>>b>>c>>ans;
  st=a<b?(a<c?a:c):(b<c?b:c);
  for(gcd=st;gcd>=1;gcd--)
  {
    if(a%gcd==0&&b%gcd==0&&c%gcd==0)
      break;
  }
  if(ans==gcd)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  return 0;
} 