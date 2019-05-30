#include<stdio.h>
int p(int a,int b)
{
  int k=1;
  	for(int i=0;i<b;i++)
    {
    	k *= a;
    }
  return k;
}
int main(){
    int a,b;
  	scanf("%d %d",&a,&b);
  	printf("%d",p(a,b));
  	return 0;
}