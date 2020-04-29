#include<iostream>
using namespace std;
int main() {
 int i = 0,n;
 float j = 0.5;
 cin>>n;
 for(i = 1; i<=n; i++) {
  cout<< j<<" ";
  j = j*3;
 }
 cout<< endl;
return 0;
}