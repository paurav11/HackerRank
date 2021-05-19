#include <stdio.h>
#include <math.h>

void calculate_the_maximum(int n,int k)
{
   if((n>=2 && n<=pow(10,3)) && (k>=2 && k<=n))
   {
     int a,b,max1=0,max2=0,max3=0;
     for(a=1;a<n;a++)
     {
       for(b=a+1;b<=n;b++)
       {
          if((a&b)>max1 && (a&b)<k)
          {
            max1=a&b;
          }

          if((a|b)>max2 && (a|b)<k)
          {
            max2=a|b;
          }

          if((a^b)>max3 && (a^b)<k)
          {
            max3=a^b;
          }
       }
     }
     printf("%d\n",max1);
     printf("%d\n",max2);
     printf("%d\n",max3);
   }
   else
   {
     printf("Value(s) are out of bound.");
   }
}

int main()
{
    int n,k;
    scanf("%d %d",&n,&k);
    calculate_the_maximum(n,k);
    return 0;
}
