#include<iostream>
#include<cstring>
using namespace std;

int main()
{
    int x =  500, y = 500;
    int x1= 500, y1= 500;
    string input;
    bool grid[1000][1000];
    grid[x][y] = 1;
    int result = 1;

    cin >> input;

    for(int i=0;i<input.length();i++)
    {
        if(i % 2 == 0)
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
        else
        {
            if(input[i] == '>')
            {
                if(grid[x1+1][y1] == 0)
                {
                    result++;
                    grid[x1+1][y1] = 1;
                    x1++;
                }
                else
                {
                    x1++;
                }
            }
            if(input[i] == '<')
            {
                if(grid[x1-1][y1] == 0)
                {
                    result++;
                    grid[x1-1][y1] = 1;
                    x1--;
                }
                else
                {
                    x1--;
                }

            }
            if(input[i] == '^')
            {
                if(grid[x1][y1+1] == 0)
                {
                    result++;
                    grid[x1][y1+1] = 1;
                    y1++;
                }
                else
                {
                    y1++;
                }
            }
            if(input[i] == 'v')
            {
                if(grid[x1][y1-1] == 0)
                {
                    result++;
                    grid[x1][y1-1] = 1;
                    y1--;
                }
                else
                {
                    y1--;
                }
            }
        }

    }

    cout << result << endl;

    return 0;
}



