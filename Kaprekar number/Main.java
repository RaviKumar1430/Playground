#include <iostream>
using namespace std;
unsigned long int digitcount(long int x)
{ unsigned long int digit=0;
	while(x)
	{
	digit++;
	x/=10;
	}
return digit;
}

unsigned long int return_A(long int x)
{
	while(x%10==0)
	x/=10;
return x;
}

unsigned long int div(long int x)
{
unsigned long int num=1;
while(x--)
num*=10;
return num;
}

 int main()
{
unsigned long int n,A,B,digits,sq,temp;
cin>>n;
sq=n*n;
digits=digitcount(sq);
A= sq/ div(digits/2);
B= sq% div(digits/2);
temp=A+B;
if(temp==n)
cout<<"Kaprekar Number";
else
cout<<"Not a Kaprekar Number";
return 1;
}