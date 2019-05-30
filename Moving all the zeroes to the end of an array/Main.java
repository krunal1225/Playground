#include <stdio.h> 
void pushZerosToEnd(int arr[], int n) 
{ 
	int count = 0;  
	for (int i = 0; i < n; i++) 
		if (arr[i] != 0) 
			arr[count++] = arr[i]; 
     while (count < n)
       arr[count++] = 0; 
} 

// Driver program to test above function 
int main() 
{ 
	int arr_size;
    scanf("%d",&arr_size);
    int arr[arr_size];
    for(int i=0; i<arr_size; i++)
      scanf("%d",&arr[i]);
	pushZerosToEnd(arr, arr_size); 
	for (int i = 0; i < arr_size; i++)
      printf("%d ",arr[i]); 
	return 0; 
} 
