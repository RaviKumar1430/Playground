#include<iostream>
#include<math.h>
using namespace std;
int main() {
 int i = 0,n;
 int j ;
 cin>>n;
 for(i = 1; i<=n; i++) {
   if(i%2==0)
     j=i*i-2;
   else
     j=i*i-1;
   cout<<j<<" ";
 }
 cout<< endl;
return 0;
}