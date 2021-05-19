#include <stdio.h>

int S(int n,int a,int b,int c)
{
   if(n==1)
   {
     return a;
   }
   else if(n==2)
   {
     return b;
   }
   else if(n==3)
   {
     return c;
   }
   else
   {
     return S(n-1,a,b,c)+S(n-2,a,b,c)+S(n-3,a,b,c);
   }
}

int main()
{
    int n,a,b,c;
    scanf("%d %d %d %d",&n,&a,&b,&c);
    if((n>=1 && n<=20) && (a>=1 && a<=100) && (b>=1 && b<=100) && (c>=1 && c<=100))
    {
      int ans = S(n,a,b,c);
      printf("%d",ans);
    }
    else
    {
      printf("Value(s) are out of bound.");
    }
    return 0;
}
