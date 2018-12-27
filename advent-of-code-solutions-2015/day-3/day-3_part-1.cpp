#include<iostream>
#include<cstring>
using namespace std;

int main()
{
    int x =  500, y = 500;
    string input;
    bool grid[1000][1000];
    grid[x][y] = 1;
    int result = 1;

    cin >> input;

    for(int i=0;i<input.length();i++)
    {
        if(input[i] == '>')
        {
            if(grid[x+1][y] == 0)
            {
                result++;
                grid[x+1][y] = 1;
                x++;
            }
            else
            {
                x++;
            }
        }
        if(input[i] == '<')
        {
            if(grid[x-1][y] == 0)
            {
                result++;
                grid[x-1][y] = 1;
                x--;
            }
            else
            {
                x--;
            }

        }
        if(input[i] == '^')
        {
            if(grid[x][y+1] == 0)
            {
                result++;
                grid[x][y+1] = 1;
                y++;
            }
            else
            {
                y++;
            }
        }
        if(input[i] == 'v')
        {
            if(grid[x][y-1] == 0)
            {
                result++;
                grid[x][y-1] = 1;
                y--;
            }
            else
            {
                y--;
            }

        }
    }

    cout << result << endl;

    return 0;
}



