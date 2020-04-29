#include<iostream>
#include<cstring>
using namespace std;
struct College
{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
}S1[20],temp;
int main()
{
  int n,i,j; 
  cin>>n;
  cout<<"Enter the number of colleges\n";
  for(i=0;i<n;i++){
    cout<<"Enter the details of college "<<i+1<<"\nEnter name\nEnter city\nEnter year of establishment\nEnter pass percentage\n";
  cin>>S1[i].name>>S1[i].city>>S1[i].establishmentYear>>S1[i].passPercentage;
  }
  cout<<"Details of colleges\n";
   for (i = 1; i < n; i++)
      for (j = 0; j < n - i; j++) {
         if (strcmp(S1[j].name, S1[j + 1].name) > 0) {
            temp = S1[j];
            S1[j] = S1[j + 1];
            S1[j + 1] = temp;
         }
      }
 
   for (i = 0; i < n; i++) {
      cout<<"College:"<<i+1<<"\nName:"<<S1[i].name<<"\nCity:"<<S1[i].city<<"\nYear of establishment:"<<S1[i]. establishmentYear<<"\nPass percentage:"<<S1[i].passPercentage<<"\n";
   }
  return 0;
}