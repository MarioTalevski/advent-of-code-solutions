#include<iostream>
using namespace std;

int main(){
    int n,len,dif,sum=0;
    cin >> n >> len;

    for(int i=0;i<n;i++)
    {
        int niza[len],min=1000000,max=0;
        dif = 0;
        for(int j=0;j<len;j++)
        {
            cin >> niza[j];
            if(niza[j] > max)
            {
                max = niza[j];
            }
            if(niza[j] < min)
            {
                min = niza[j];
            }
        }
        dif=max-min;
        sum = sum + dif;
    }

    cout << sum;

    return 0;
}
