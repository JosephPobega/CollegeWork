namespace lab1ClickableFlags
{
    partial class Main
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
            this.usaFlagText = new System.Windows.Forms.Label();
            this.russianflagText = new System.Windows.Forms.Label();
            this.greeceFlagText = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.pictureBox3 = new System.Windows.Forms.PictureBox();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // usaFlagText
            // 
            this.usaFlagText.AutoSize = true;
            this.usaFlagText.Location = new System.Drawing.Point(238, 244);
            this.usaFlagText.Name = "usaFlagText";
            this.usaFlagText.Size = new System.Drawing.Size(29, 13);
            this.usaFlagText.TabIndex = 0;
            this.usaFlagText.Text = "USA";
            // 
            // russianflagText
            // 
            this.russianflagText.AutoSize = true;
            this.russianflagText.Location = new System.Drawing.Point(362, 244);
            this.russianflagText.Name = "russianflagText";
            this.russianflagText.Size = new System.Drawing.Size(39, 13);
            this.russianflagText.TabIndex = 1;
            this.russianflagText.Text = "Russia";
            // 
            // greeceFlagText
            // 
            this.greeceFlagText.AutoSize = true;
            this.greeceFlagText.Location = new System.Drawing.Point(497, 244);
            this.greeceFlagText.Name = "greeceFlagText";
            this.greeceFlagText.Size = new System.Drawing.Size(42, 13);
            this.greeceFlagText.TabIndex = 2;
            this.greeceFlagText.Text = "Greece";
            //
        
         
            // pictureBox3
            // 
            this.pictureBox3.Image = global::lab1ClickableFlags.Properties.Resources.greece;
            this.pictureBox3.Location = new System.Drawing.Point(470, 146);
            this.pictureBox3.Name = "pictureBox3";
            this.pictureBox3.Size = new System.Drawing.Size(100, 50);
            this.pictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox3.TabIndex = 8;
            this.pictureBox3.TabStop = false;
            this.pictureBox3.Click += new System.EventHandler(this.pictureBox3_Click);
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = global::lab1ClickableFlags.Properties.Resources.russia;
            this.pictureBox2.Location = new System.Drawing.Point(334, 146);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(100, 50);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 7;
            this.pictureBox2.TabStop = false;
            this.pictureBox2.Click += new System.EventHandler(this.pictureBox2_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::lab1ClickableFlags.Properties.Resources.usaFlag;
            this.pictureBox1.Location = new System.Drawing.Point(202, 146);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(100, 50);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 6;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(771, 483);
            this.Controls.Add(this.pictureBox3);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.greeceFlagText);
            this.Controls.Add(this.russianflagText);
            this.Controls.Add(this.usaFlagText);
            this.Name = "Main";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label usaFlagText;
        private System.Windows.Forms.Label russianflagText;
        private System.Windows.Forms.Label greeceFlagText;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.PictureBox pictureBox3;
    }
}

