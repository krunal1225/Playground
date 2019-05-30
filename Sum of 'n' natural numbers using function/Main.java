#include<stdio.h>
int sum(int n)
{
	return (n*(n+1))/2;
}
int main() {
    int num;
    scanf("%d",&num);
  	printf("%d",sum(num));
  	return 0;
}