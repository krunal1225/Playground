#include <stdio.h>
int main(){
	int a,b,c;
  	scanf("%d %d %d",&a,&b,&c);
  	int k=large_num(a,b);
  	int d=large_num(k,c);
  	printf("%d",d);
  	return 0;
}
int large_num(int a,int b)
{
	if(a>b)
      return a;
  	else
      return b;
}