namespace lab5
{
    partial class TypingGrades
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Enter = new System.Windows.Forms.Button();
            this.Reset = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.wpmBox = new System.Windows.Forms.TextBox();
            this.resultsBox = new System.Windows.Forms.TextBox();
            this.wpmLabel = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // Enter
            // 
            this.Enter.Location = new System.Drawing.Point(102, 370);
            this.Enter.Name = "Enter";
            this.Enter.Size = new System.Drawing.Size(75, 53);
            this.Enter.TabIndex = 0;
            this.Enter.Text = "Enter";
            this.Enter.UseVisualStyleBackColor = true;
            this.Enter.Click += new System.EventHandler(this.Enter_Click);
            // 
            // Reset
            // 
            this.Reset.Location = new System.Drawing.Point(231, 370);
            this.Reset.Name = "Reset";
            this.Reset.Size = new System.Drawing.Size(75, 53);
            this.Reset.TabIndex = 1;
            this.Reset.Text = "Reset";
            this.Reset.UseVisualStyleBackColor = true;
            this.Reset.Click += new System.EventHandler(this.Reset_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Tai Le", 36F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 33);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(285, 62);
            this.label1.TabIndex = 2;
            this.label1.Text = "Type Grader";
            // 
            // wpmBox
            // 
            this.wpmBox.Location = new System.Drawing.Point(194, 164);
            this.wpmBox.Name = "wpmBox";
            this.wpmBox.Size = new System.Drawing.Size(100, 20);
            this.wpmBox.TabIndex = 3;
            // 
            // resultsBox
            // 
            this.resultsBox.Location = new System.Drawing.Point(194, 233);
            this.resultsBox.Multiline = true;
            this.resultsBox.Name = "resultsBox";
            this.resultsBox.Size = new System.Drawing.Size(112, 34);
            this.resultsBox.TabIndex = 4;
            // 
            // wpmLabel
            // 
            this.wpmLabel.AutoSize = true;
            this.wpmLabel.Font = new System.Drawing.Font("Microsoft Tai Le", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.wpmLabel.Location = new System.Drawing.Point(98, 163);
            this.wpmLabel.Name = "wpmLabel";
            this.wpmLabel.Size = new System.Drawing.Size(51, 21);
            this.wpmLabel.TabIndex = 5;
            this.wpmLabel.Text = "WPM";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Tai Le", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(98, 232);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(64, 21);
            this.label3.TabIndex = 6;
            this.label3.Text = "Results";
            // 
            // TypingGrades
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Control;
            this.ClientSize = new System.Drawing.Size(449, 498);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.wpmLabel);
            this.Controls.Add(this.resultsBox);
            this.Controls.Add(this.wpmBox);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Reset);
            this.Controls.Add(this.Enter);
            this.Name = "TypingGrades";
            this.Text = "Type Grader";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Enter;
        private System.Windows.Forms.Button Reset;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox wpmBox;
        private System.Windows.Forms.TextBox resultsBox;
        private System.Windows.Forms.Label wpmLabel;
        private System.Windows.Forms.Label label3;
    }
}

