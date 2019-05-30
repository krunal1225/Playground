// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
   int array[100], maximum, size, c, location = 1;
   scanf("%d", &size);
   for (c = 0; c < size; c++)
     scanf("%d", &array[c]);
   maximum = array[0];
   for (c = 1; c < size; c++)
   {
     if (array[c] > maximum)
     {
       maximum  = array[c];
       location = c;
     }
   }
   printf("%d", location);
   return 0;
}