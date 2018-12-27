#include<iostream>
using namespace std;

int main()
{
    string n;
    int sum = 0;

    cin >> n;

    if(n[0] == n[n.length()-1])
    {
        sum = sum + (n[0] - '0');
    }

    for(int i=0; i<n.length()-1; i++)
    {
        if(n[i] == n[i+1])
        {
            sum = sum + (n[i] - '0');
        }
    }

    cout << sum;

    return 0;
}
