#include <stdio.h>
int main() {
	int num,num1;
  	scanf("%d\n",&num);
  	int sum=0;
  	num1=num;
  	while(num > 0)
    {
      num = num/10;
      num1 = num1%10;
      sum += num1;
      num1=num;
    }
  	printf("%d",sum);
	return 0;
}