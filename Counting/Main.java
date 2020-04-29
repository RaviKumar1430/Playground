#include<iostream>
#include<cstring>
using namespace std;
int main() {
    char str[200];
    int vowels=0, consonant=0, digit=0, space=0,symbols=0;
    cin.getline(str,200);
    for (int i = 0; i<strlen(str); i++) {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' ||str[i] == 'o' || str[i] == 'u' || str[i] == 'A' ||str[i] == 'E' || str[i] == 'I' || str[i] == 'O' ||str[i] == 'U') {
            ++vowels;
        } else if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z')) {
            ++consonant;
        } else if (str[i] >= '0' && str[i] <= '9') {
            ++digit;
        } else if (str[i] == ' ') {
            ++space;
        }
      else
        ++symbols;
    }

    cout<<"Vowels:"<<vowels;
    cout<<"\nConsonants:"<<consonant;
    cout<<"\nWhite Spaces:"<< space;
    cout<<"\nDigits:"<<digit;
    cout<<"\nSymbols:"<<symbols;
    return 0;
}