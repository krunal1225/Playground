#include<stdio.h>
int square(int n)
{
	return n*n;
}
int main() {
   int num;
   scanf("%d",&num);
   printf("%d",square(num));
   return 0;
}