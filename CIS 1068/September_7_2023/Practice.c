#include <stdlib.h>

int main(void)
{
    int x = 10, y = 20;
    reord(y, x);

    return EXIT_SUCCESS;
}

void reord(int x, int y)
{
    printf("%d %d\n", x, y);
}