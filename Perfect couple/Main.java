#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
  int check_sum = 0;
  int flag = 0;
  for(int index = 0; index <= size-1; index++)
  {
     for(int idx = index + 1; idx <= size - 1; idx++)
     {
        check_sum = arr[index] + arr[idx];
        if(check_sum == sum)
        {
          printf("Perfect couple: %d %d", arr[index], arr[idx]);
          flag = 1;
        }
     }
  }
  if(flag == 0)
    printf("No perfect couple found!");
}