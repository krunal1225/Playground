#include <stdio.h>
int main() {
	int n;
  	scanf("%d",&n);
  	int count = 1;
  	for(int i=0;i<n;i++)
    {
      printf("%d\n",count);
      count += 2;
    }
  	
	return 0;
}