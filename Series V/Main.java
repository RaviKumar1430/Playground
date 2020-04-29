#include<iostream>
#include<math.h>
using namespace std;
int main() {
 int i = 0,n;
 int j = 121;
 cin>>n;
 for(i = 1; i<=n; i++) {
  cout<< j<<" ";
  j = (sqrt(j)+4)*(sqrt(j)+4);
 }
 cout<< endl;
return 0;
}