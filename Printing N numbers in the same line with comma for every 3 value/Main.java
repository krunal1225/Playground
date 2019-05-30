#include <stdio.h>
int main() {
	int n,m=3;
  	scanf("%d",&n);
  	for(int i=1;i<=n;i++)
    {
      	if(i % m == 0)
          printf("%d,",i);
        else
          printf("%d",i);
    }
	return 0;
}