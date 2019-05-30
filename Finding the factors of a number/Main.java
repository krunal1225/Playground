#include <stdio.h>
int main() {
	int num,start = 1;
  	scanf("%d",&num);
  	printf("%d\n",start);
  	for(int i=2;i<num;i++)
    {
      if(num % i == 0)
        printf("%d\n",i);
    }
  	printf("%d",num);
	return 0;
}