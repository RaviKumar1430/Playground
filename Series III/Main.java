#include<iostream>
#include<math.h>
using namespace std;
int main() {
 int i = 0,n;
 int j = 6;
 cin>>n;
 for(i = 1; i<=n; i++) {
  cout<< j<<" ";
  j = j+5*i;
 }
 cout<< endl;
return 0;
}