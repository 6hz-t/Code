#include "utils.h"

utils::utils() {}
void utils::getCRbyid(int a[9][10],int &row,int &col,int id)
{
    for(int i=0;i<9;i++)
        for(int j=0;j<10;j++)
        {
            if(a[i][j]==id)
            {
                col=i;
                row=j;
                return;
            }
        }
}
