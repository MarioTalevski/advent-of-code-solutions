#include<iostream>
using namespace std;

int main(){
    int n,len,even,sum=0;
    cin >> n >> len;

    for(int i=0;i<n;i++)
    {
        int niza[len];
        even = 0;
        for(int j=0;j<len;j++)
        {
            cin >> niza[j];

        }
        for(int x=0;x<len;x++)
        {
            for(int y=0;y<len;y++)
            {
                if(niza[x]%niza[y]==0 && niza[x]/niza[y]>1)
                {
                    even = even + (niza[x]/niza[y]);
                }
            }
        }

        sum = sum + even;
    }

    cout << sum;

    return 0;
}
