#include <stdio.h>
#include <math.h>

int main()
{
  int a,b,sum1,diff1;
  float c,d,sum2,diff2;

  //printf("Enter a & b: ");
  scanf("%d %d",&a,&b);
  //printf("Enter c & d: ");
  scanf("%f %f",&c,&d);
  if((a>=1 && a<=pow(10,4)) && (b>=1 && b<=pow(10,4)) && (c>=1 && c<=pow(10,4)) && (d>=1 && d<=pow(10,4)))
  {
     sum1=a+b;
     diff1=a-b;
     sum2=c+d;
     diff2=c-d;
     printf("%d %d\n",sum1,diff1);
     printf("%0.1f %0.1f",sum2,diff2);
  }
  else
  {
    printf("Number(s) not in prescribed range (1 to 10000).");
  }
  return 0;
}
