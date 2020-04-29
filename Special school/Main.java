#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str1[100],str2[100];
  cin>>str1>>str2;
  int i=0,j=0;
  while(str1[j+1])
    j++;
  while(i<j)
  {
    char temp=str1[i];
    str1[i]=str1[j];
    str1[j]=temp;
    i++;
    j--;
  }
  int c=strcmp(str1,str2);
  if(c==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}