#include <stdio.h>
int fact(int n)
{
  	int f = 1; 
	for(int i=1;i<=n;i++)
      f *= i;
  	return f;
}
int main() {
	int number,originalNumber,res = 0,r;
  	scanf("%d",&number);
  	originalNumber = number;
  	while(number > 0)
    {
    	r = number % 10;
      	res += fact(r);
      	number /= 10;
    }
  	if(originalNumber == res)
      printf("Yes");
  	else
      printf("No");
	return 0;
}