using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics.Tracing;
using System.Drawing;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Console;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;


namespace lab5
{
    public partial class TypingGrades : Form
    {
        public TypingGrades()
        {
            InitializeComponent();
        }

        private void Reset_Click(object sender, EventArgs e)
        {
            wpmBox.Clear();
            resultsBox.Clear();
        }


        private void Enter_Click(object sender, EventArgs e)
        {

            int varwpm;
            int varresults;
            int[] wordsRangeLowLimits = { 0, 16, 31, 51, 76 };
            char[] grade = { 'F', 'D', 'C', 'B', 'A' };
            char StudentGrade;
            int words;
            int x = wordsRangeLowLimits.Length - 1;

            varwpm = Convert.ToInt32(wpmBox.Text);

            while(x > 0 && varwpm < wordsRangeLowLimits[x]){
                --x;
            }
            StudentGrade = grade[x];

            resultsBox.Text = ("Typing " + varwpm + " words per minute: Grade: " + StudentGrade);
        }
    }
}
