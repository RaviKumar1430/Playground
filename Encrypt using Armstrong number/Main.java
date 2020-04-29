#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int sum=0,rem,temp,a=0,f;
  f=n;
  while(f!=0)
  {
    f=f/10;
    a=a+1;
  }
  temp=n;
  while(n!=0)
  {
    rem=n%10;
    sum=sum+power(rem,a);
    n=n/10;
  }
  if(temp==sum)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
}