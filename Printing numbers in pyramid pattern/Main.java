#include <stdio.h>
int main()
{
    int i, space, rows, k=0;
    scanf("%d",&rows);
  	int count = 1;
    for(i=1; i<=rows; ++i, k=0)
    {
        for(space=1; space<=rows-i; ++space)
            printf(" ");
       while(k != i)
        {
            printf("%d ",count);
         	count++;
            ++k;
        }
        printf("\n");
    }
    return 0;
}