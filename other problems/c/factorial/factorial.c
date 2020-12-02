#include <stdio.h>

// by recursion
int factByRecur(int n)
{
    if (n == 1)
        return 1;
    else if (n == 0)
        return 1;
    else
        return n * factByRecur(n - 1);
}
int factByLoop(int n)
{
    int value = 5;
    for (int i = n; i > 1; i--)
    {
        value = value * (i - 1);
    }
    return value;
}
int main()
{
    printf("%d\n", factByRecur(5));
    printf("%d\n", factByLoop(5));
    return 0;
}