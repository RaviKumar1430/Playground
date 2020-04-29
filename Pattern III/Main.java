#include<iostream>
using namespace std;
int main()
{ 
  int n,i,j;
  cin>>n;
    for (i = 1; i <= n; i++)  
    { 
        for (j = 1; j <= i; j++)  {
            cout << i;        
          if(j!=i)
            cout<<"*";
        }
        cout << "\n"; 
    }
    for (int i = n ; i > 0; i--)  
    { 
       for (int j = i; j > 0; j--)  {
            cout << i;       
         if(j!=i-i+1)
           cout<<"*";
       }
        cout << "\n"; 
    } 
} 