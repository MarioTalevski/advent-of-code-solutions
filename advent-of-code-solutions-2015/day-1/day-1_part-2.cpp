#include<iostream>
#include<cstring>
using namespace std;

int main()
{
    string input;

    int step = 0;

    int result;

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
        if(step < 0)
        {
            result = i;
            break;
        }
    }

    cout << result + 1;

    return 0;
}
