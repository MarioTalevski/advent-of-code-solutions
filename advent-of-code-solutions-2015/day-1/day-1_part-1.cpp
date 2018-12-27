#include<iostream>
#include<cstring>
using namespace std;

int main()
{
    string input;

    int step = 0;

    cin >> input;

    for(int i=0; i < input.length(); i++)
    {
        if(input[i] == '(')
        {
            step++;
        }
        else
        {
            step--;
        }
    }

    cout << step;

    return 0;
}
