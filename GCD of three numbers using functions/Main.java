#include <stdio.h>
int main() {
	int a,b,c;
  	scanf("%d %d %d",&a,&b,&c);
  	int k=gcd(a,b);
  	int d=gcd(k,c);
  	printf("%d",d);
	return 0;
}
int gcd(int a,int b)
{
  int min;
	if(a>b)
      min=b;
  	else
      min=a;
  while(min>0){
  	if((a%min==0) && (b%min==0))
      return min;
  	else
      min--;
  }
}