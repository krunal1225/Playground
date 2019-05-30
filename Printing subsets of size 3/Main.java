#include<stdio.h>
int sub_set(int size, int arr[]);
int main()
{
  int size;
  scanf("%d", &size);
  int arr[size];
  for(int idx = 0; idx <= size-1; idx++)
    scanf("%d", &arr[idx]);
  sub_set(size,arr);
  return 0;
}
int sub_set(int size, int arr[])
{
	for(int idx_1 = 0; idx_1 <= size-1; idx_1++)
    {
       for(int idx_2 = idx_1 + 1; idx_2 <= size-1; idx_2++)
       {
          for(int idx_3 = idx_2 + 1; idx_3 <= size-1; idx_3++)
          {
             printf("(%d, %d, %d) ", arr[idx_1], arr[idx_2], arr[idx_3]);
          }
       }
      if(idx_1 != (size - 3))
        printf("\n");
    }
}