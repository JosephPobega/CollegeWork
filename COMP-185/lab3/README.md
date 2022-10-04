Description: Credit Card numbers sometimes contain a check digit that is the result of a mathematical calculation. The inclusion of the digit in an account number helps ascertain whether the number is a valid one.  Write an application that asks a user to enter the last four-digits of their credit card number and determines whether it is a valid card number.  The number is valid if the fourth digit is the remainder when the number represented by the first three digits of the four-digit number is divided by a specific number.

Example: Check digit number is 7, last four of the card is 7770, because 0 is the remainder when 777 is divided by 7 the card is valid.

Recommendations: Have your application provide the option to pick either a Visa account, Amex Account, or Discover account...each having their own unique check digit.

Requirements:

If the account number is valid, output The card number is valid. Otherwise output Invalid.
I must be warned if I enter anything other than exactly 4 digits.
I must be able to continue checking card numbers.
The check digit must be a constant...or an enum if you offer the ability to select an option
I must be able to validate my number by pressing the enter key
Provide a valid and in-valid test case in your comment with the uploaded submission.
