#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int a[2];
  for(int i=0;i<2;i++)
    scanf("%d",&a[i]);
  int flag=0;
  	for(int i=0;i<n;i++)
    {
    	if(a[0]==arr[i])
        {flag=1;
          printf("%d\n",i);}
    }
  if(flag==0)
      printf("-1");
  flag=0;
  for(int i=0;i<n;i++)
    {
    	if(a[1]==arr[i])
        {flag=1;
          printf("%d\n",i);}
    }
    if(flag==0)
      printf("-1");
  return 0;
}