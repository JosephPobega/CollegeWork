﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }



        private void button1_Click(object sender, EventArgs e)
        {
            OtherForm formOther = new OtherForm();
            formOther.ShowDialog();
           
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            OtherForm2 formOther2 = new OtherForm2();
            formOther2.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            OtherForm3 formOther3 = new OtherForm3();
            formOther3.ShowDialog();
        }
    }
}

