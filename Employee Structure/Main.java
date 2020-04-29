#include <iostream>
using namespace std;
struct employee {
   int empID;
   char name[50];
  int age;
   int salary;
   char desgination[50];
};
int main() {
   struct employee emp;
  cin>>emp.name>>emp.empID>>emp.age>>emp.desgination>>emp.salary;
  cout<<"Enter name:\n"<<"Enter ID:\n"<<"Enter age:\n"<<"Enter designation:\n"<<"Enter Salary:\n"<<"Employee Details\n";
   cout<<"Name of the Employee : "<<emp.name<<"\n"<<"ID of the Employee : "<<emp.empID<<"\n"<<"Age of the Employee : "<<emp.age<<"\n"<<"Designation of the Employee : "<<emp.desgination<<"\n"<<"Salary of the Employee : "<<emp.salary;
   return 0;
}