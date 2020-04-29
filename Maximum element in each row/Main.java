#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  int i=0,j,max=0,maxm;
  while (i<n)
  {
    for(j=0;j<m;j++)
    {
      if(a[i][j]>max){
        max=a[i][j];
      }
    }
    maxm=max;
    max=0;
    cout<<maxm<<"\n";
    i++;
  }
}
