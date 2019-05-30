#include <stdio.h>
int main(){
	int n;
  	scanf("%d",&n);
  	int count = 1; 
  	for(int cur_row=0;cur_row<n;cur_row++)
    {
      for(int cur_col=0;cur_col<=cur_row;cur_col++)
      {
        if(count % 2 == 0)
          printf("#");
        else
          printf("*");
        count++;
      }
      printf("\n");
    }
  	return 0;
}