#include<iostream>
using namespace std;
int main()
{
  int r,c,sum=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  for(int row=0; row<r; row++)
    {
        sum = 0;
        for(int col=0; col<c; col++)
        {
            sum += a[row][col];
        }
        cout << sum <<"\n";
  }
}