#include<stdio.h>
#include<string.h>
int  Rotation_check(char *str1, char *str2)
{
    int l1 = strlen(str1);
    int l2 = strlen(str2);
    if(l1 != l2)
      printf("No");
  
    int len = strlen(str1); 
	char temp[len]; 
    int flag = 0;
	for (int i = 0; i < len; i++) 
	{ 
		int j = i;  
		int k = 0;  
		while (str1[j] != '\0') 
		{ 
			temp[k] = str1[j]; 
			k++; 
			j++; 
		} 
		j = 0; 
		while (j < i) 
		{ 
			temp[k] = str1[j]; 
			j++; 
			k++; 
		}
        if(!strcmp(temp,str2))
          flag = 1;
	}
     if(flag == 1)
       printf("Yes");
     else
       printf("No");
}
int main()
{
  char st1[20], st2[20];
  gets(st1);
  gets(st2);
  Rotation_check(st1,st2);
  return 0;
}