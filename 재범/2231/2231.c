#include<stdio.h>
#pragma warning(disable:4996)

int main(void)
{
	int n, i;
	scanf("%d", &n);
	int flag = 0;
	for (i = 1; i < n; i++)
	{
		int num = i;
		int temp = i;
		// 정말 획기적인 방법.... 긴 숫자를 자릿수마다 방문 하고 싶을 때 쓰면 좋을 듯 함
		while (temp > 0)
		{
			num += (temp%10);
			temp /= 10;
		}
		if (num == n)
		{
			printf("%d", i);
			flag = 1;
			break;
		}
	}
	if (flag != 1)
		printf("0");
}