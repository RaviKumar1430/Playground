#include<iostream>
#include<cstring>
using namespace std;
struct College
{
  char name[100];
  char dept[100];
  int studyYear;
  float cgpa;
}S1[20],temp;
int main()
{
  int n,i,j; 
  cin>>n;
  cout<<"Enter the number of students\n";
  for(i=0;i<n;i++){
    cout<<"Enter the details of student "<<i+1<<"\nEnter name\nEnter department\nEnter year of study\nEnter cgpa\n";
  cin>>S1[i].name>>S1[i].dept>>S1[i].studyYear>>S1[i].cgpa;
  }
  cout<<"Details of students\n";
   for (i = 1; i < n; i++)
      for (j = 0; j < n - i; j++) {
         if (strcmp(S1[j].name, S1[j + 1].name) > 0) {
            temp = S1[j];
            S1[j] = S1[j + 1];
            S1[j + 1] = temp;
         }
      }
 
   for (i = 0; i < n; i++) {
      cout<<"Student "<<i+1<<"\nName:"<<S1[i].name<<"\nDepartment:"<<S1[i].dept<<"\nYear of study:"<<S1[i]. studyYear<<"\nCGPA:"<<S1[i].cgpa<<"\n";
   }
  return 0;
}