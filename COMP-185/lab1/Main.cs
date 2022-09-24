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
            
          
            usaFlagText.Visible = false;
            russianflagText.Visible = false;
            greeceFlagText.Visible = false;

        }
  
        private void pictureBox1_Click(object sender, EventArgs e)
        {
            usaFlagText.Visible = true;
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            russianflagText.Visible = true;

        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            greeceFlagText.Visible = true;
        }
    }
}
