using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

//Credit Card numbers sometimes contain a check digit that is the result of a mathematical calculation.
//The inclusion of the digit in an account number helps ascertain whether the number is a valid one.  Write
//an application that asks a user to enter the last four-digits of their credit card number and determines whether
//it is a valid card number.  The number is valid if the fourth digit is the remainder when the number represented
//by the first three digits of the four-digit number is divided by a specific number.



namespace creditCardValidator
{
    public partial class CreditCardValidator : Form
    {
        const int SECRETKEY = 8;
        
        
        public CreditCardValidator()
        {
            InitializeComponent();
        }

        
        private void CreditCardValidator_Load(object sender, EventArgs e)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {

            if (textBox1.Text.Length == 4)
            {
                try
                {

                    int iFirstThree, iFourth, iCardNum;
                    iCardNum = int.Parse(textBox1.Text);
                    iFirstThree = iCardNum / 10;
                    iFourth = iCardNum % 10;

                    if ((iFirstThree % SECRETKEY) == iFourth)
                    { label3.Text = "Valid"; }

                    else
                    {
                        label3.Text = "Invalid";
                    }

                }
                catch
                { label3.Text = "Must be numeric;"; }
            }
            else
            {
                { label3.Text = "must be 4 characters"; }
                label3.Visible = true;
            }
            }
                


           
            
        }

       
    }

