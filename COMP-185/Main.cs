using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab1ClickableFlags
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
            pictureBox1.Visible = false;
            pictureBox2.Visible = false;
            pictureBox3.Visible = false;
            usaFlagText.Visible = false;
            russianflagText.Visible = false;
            greeceFlagText.Visible = false;

        }

        private void button1_Click(object sender, EventArgs e)
        {
            pictureBox1.Visible = true;
            usaFlagText.Visible = true;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            pictureBox2.Visible = true;
            russianflagText.Visible = true;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            pictureBox3.Visible = true;
            greeceFlagText.Visible = true;
        }
    }
}
