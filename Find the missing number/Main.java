#include<stdio.h> 
int getMissingNo (int a[], int n) 
{ 
	int i, total; 
	total = (n+1)*(n+2)/2; 
	for ( i = 0; i< n; i++) 
	total -= a[i]; 
	return total; 
} 
int main() 
{ 
	int size;
    scanf("%d",&size);
    int arr[size];
    for(int i = 0; i<size; i++)
      scanf("%d",&arr[i]);
	int miss = getMissingNo(arr,size); 
	printf("%d", miss); 
	getchar(); 
} 
