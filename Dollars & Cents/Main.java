#include<iostream>
using namespace std;
int main()
{
int d1,d2,c1,c2,x;
cin>>d1>>c1>>d2>>c2;
x=c1+c2;
if(x>99){
cout<<d1+d2+(x/100)<<"\n";
cout<<x-(x/100)*100;
}
else{
cout<<d1+d2<<"\n";
cout<<c1+c2;
}
}