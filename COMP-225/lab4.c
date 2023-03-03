
#include <stdio.h>
#include <string.h>

int main(){

        char word[30];


        char *start=word;
        printf("Enter a word: ");
        scanf("%s", &word);

        int len = 0;
        char *end = start;
        while(*end != '\0'){

                ++end;
                ++len;
