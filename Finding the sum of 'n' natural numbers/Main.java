#include <stdio.h>
void display_sum(int);
int main()
{
    int num;
    scanf("%d", &num);
    display_sum(num);
    return 0;
}
void display_sum(int num)
{
    static int sum = 0;
    if (num == 0)
    {
        printf("%d", sum);
        return;
    }
    else
    {
        sum += num;
        display_sum(--num);
    }
}