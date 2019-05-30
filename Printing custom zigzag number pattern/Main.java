#include <stdio.h>
int main() {
	int n;
  	scanf("%d",&n);
  	int count = 1;
  	int flag = 0;
  	for(int row=1;row<=n;row++)
    {
      	if(row%2 == 0)
          flag=1;
    	for(int col=1;col<=n;col++)
        {
          if(row%2 == 1){
          if(col == n)
            count++;}
          printf("%d",count);
          if(flag == 1)
          {
          	if(row%2 == 0)
              count--;
            flag=0;
          }
         }
      count++;
      printf("\n");
    }
	return 0;
}