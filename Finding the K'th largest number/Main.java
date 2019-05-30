#include <stdio.h>
int main()
{
  int array[100], n, c, d, position, swap;
  scanf("%d", &n);
  for (c = 0; c < n; c++)
    scanf("%d", &array[c]);
  int idx;
  scanf("%d", &idx);
  for (c = 0; c < (n - 1); c++)
  {
    position = c;
    for (d = c + 1; d < n; d++)
    {
      if (array[position] < array[d])
        position = d;
    }
    if (position != c)
    {
      swap = array[c];
      array[c] = array[position];
      array[position] = swap;
    }
  }
    printf("%d", array[idx-1]);
  return 0;
}