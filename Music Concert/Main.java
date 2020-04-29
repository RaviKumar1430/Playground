#include<iostream>
#include<cstdlib>
int main(){
  int *a,c1=0,c2=0,n;
  std::cin>>n;
  a=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      c1+=1;
    else
      c2+=1;
  }
  std::cout<<c2<<"\n"<<c1;
  return 0;
}