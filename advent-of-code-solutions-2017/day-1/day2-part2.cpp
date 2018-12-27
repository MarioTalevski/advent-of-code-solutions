#include<iostream>
using namespace std;

int main()
{
    string n;
    int sum = 0;

    cin >> n;

    int halfway = n.length() / 2;

    for(int i=0; i<n.length(); i++)
    {
        int c = i + halfway;

        if(c>=n.length())
        {
          c-=n.length();
        }

        if(n[i] == n[c])
        {
            sum+=(n[i] - '0');
        }
    }

    cout << sum;

    return 0;
}
