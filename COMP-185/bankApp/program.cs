using System;
using static System.Console;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            double bankBal = 1000;
            const double INT_RATE = 0.04;
            string inputString;
            char response;
            Write("Do you want to see your palance? Y or N...");
            inputString = ReadLine();
            response = Convert.ToChar(inputString);
            while(response == 'Y' | response == 'y')
            {
                WriteLine("Bank Balance is {0}", bankBal.ToString("C"));
                bankBal = bankBal + bankBal + INT_RATE;
                Write("Do you want to see next years balance? Y or N...");
                inputString = ReadLine();
                response = Convert.ToChar(inputString);
            }
            WriteLine("Have a nice day!");
        }
    }
}
