#include <stdio.h>

int main()
{
  int n,sum=0;
  scanf("%d",&n);
  if(n>=10000 && n<=99999)
  {
    while(n!=0)
    {
      sum=sum+(n%10);
      n=n/10;
    }
    printf("%d",sum);
  }
  else
  {
    printf("Value of n is out of bounds.");
  }
  return 0;
}
