#include<stdio.h>
int fact(int x)
{
   if(x == 0)
     return 1;
   else
     return x * fact(x-1);
}
int main()
{
	int num;
    scanf("%d", &num);
    printf("%d", fact(num));
	return 0;
}