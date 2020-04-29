#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str1[100],str2[100];
  cin>>str1>>str2;
  int eq=strcmp(str1,str2);
  if(eq==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}