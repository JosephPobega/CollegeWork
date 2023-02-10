#include <stdio.h>

void main(void){

        int penny, nickle, dime, quarter, dollar, totalPennies;
        float amount;

        printf("Enter the dollars and pennies > ");
        scanf("%f",&amount);

        printf("The amount you entered is %6.2f\n", amount);

        totalPennies = amount*100;
        dollar = totalPennies / 100;
        totalPennies = totalPennies%100;

        printf("Amount of bills: %d\n", dollar);

        quarter = totalPennies/25;
        totalPennies = totalPennies%25;
        printf("Amount of Quarters %d\n", quarter);

        dime = totalPennies/10;
        totalPennies = totalPennies % 10;
        printf("amount of Dimes: %d\n", dime);

        nickle = totalPennies/5;
        totalPennies = totalPennies % 5;
        printf("amount of Nickles: %d\n", nickle);

        penny=totalPennies;
        printf("amount of Pennies: %d\n", penny);
