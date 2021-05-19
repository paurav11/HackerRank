#include <stdio.h>

int main()
{
  char ch,s[100],sen[100];
  //printf("Enter character: ");
  scanf("%c",&ch);
  //printf("\nEnter string: ");
  scanf("%s",s);
  scanf("\n");
  //printf("\nEnter sentence: ");
  scanf("%[^\n]%*c",sen);
  printf("%c\n",ch);
  printf("%s\n",s);
  printf("%s",sen);
  return 0;
}
