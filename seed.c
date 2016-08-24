#include <stdio.h>
int main(void)
{
	int x,sum,t;
	scanf("%d",x);
	sum=x;
	while(n!=0)
	{
    t=x%10;
    sum*=t;
    x=t/10;
	}
	printf("%d",sum);
	return 0;
}
