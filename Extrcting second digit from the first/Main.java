#include <stdio.h>
int main() {
	int n,n1;
  	scanf("%d",&n);
  	int digit_count=0;
  	n1=n;
  	while(n > 0)
    {
      n=n/10;
      digit_count++;
    }
  	while(digit_count > 2)
    {
      n1=n1/10;
      digit_count--;
    }
  	n1=n1%10;
    printf("%d",n1);
	return 0;
}