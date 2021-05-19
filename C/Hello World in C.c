#include <stdio.h>

int main()
{
  char s[100]={'W','e','l','c','o','m','e',' ','t','o',' ','C',' ','p','r','o','g','r','a','m','m','i','n','g','.'};
  int i;
  //char s[100]="Welcome to C programming.";
  printf("Hello, World!\n");
  //printf("%s",s);
  s[25]='\0';
  for(i=0;s[i]!='\0';i++)
  {
     printf("%c",s[i]);
  }
  return 0;
}
