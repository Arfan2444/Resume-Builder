package resume_builder;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class frame_2 implements ActionListener, KeyListener {
    JFrame frame2;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    JLabel l12;
    JLabel l13;
    JLabel l14;
    JLabel l15;
    JLabel l16;
    JLabel l17;
    JLabel l18;
    JLabel l19;
    JLabel l20;
    JLabel l21;
    JLabel l22;
    JLabel l23;
    JLabel l24;
    JLabel l25;
    JLabel l26;
    JLabel l27;
    JLabel l28;
    JLabel l29;
    JLabel l30;
    JLabel l31;
    JLabel l32;
    JLabel l33;
    JLabel l34;
    JLabel l35;
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JTextField tf9;
    JTextField tf10;
    JTextField tf11;
    JTextField tf12;
    JTextField tf13;
    JTextField tf14;
    JTextField tf15;
    JTextField tf16;
    JTextField tf17;
    JTextField tf18;
    JTextArea ta1;
    JComboBox comboBox1;
    JComboBox comboBox2;
    JComboBox comboBox3;
    JComboBox comboBox4;
    JComboBox comboBox5;
    JComboBox comboBox6;
    JComboBox comboBox7;
    JFileChooser fileChooser;
    FileNameExtensionFilter filter;
    JButton b2;
    String grade[] = {"A+", "A", "B+", "B", "C+", "C", "D+", "D"};
    String days[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String expyears[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
    String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String years[] = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"};
    String passingyears[] = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024"};
    String courses[] = {"BCA", "BCOM", "BAF", "BA", "BSC", "MBA", "BUMS", "BSCIT", "BE", "BTech"};

    static String choice1;static String choice2;static String choice3;static String choice4;static String choice5;static String choice6;
    static String choice7;static String choice8;
    static String choice9;static String choice10;static String choice11;static String choice12;static String choice13;
    static String choice14;static String choice15;
    static String choice16;static String choice17;static String choice18;static String choice19;static String choice20;
    static String choice21;String choice22;
    String choice23;String choice24;String choice25;
    static String choice26;

    frame_2() {

        l8 = new JLabel("--Personal Details--");
        l8.setBounds(40, 30, 200, 30);
        l8.setFont(new Font("Times New Roman", Font.BOLD, 25));

        l9 = new JLabel();
        l9.setText("Full name:");
        l9.setBounds(40, 80, 90, 20);

        l10 = new JLabel();
        l10.setText("Father's name:");
        l10.setBounds(40, 110, 90, 20);

        l11 = new JLabel();
        l11.setText("Email:");
        l11.setBounds(40, 138, 90, 20);

        l12 = new JLabel();
        l12.setText("D.O.B:");
        l12.setBounds(40, 165, 70, 20);

        l13 = new JLabel();
        l13.setText("Address:");
        l13.setBounds(40, 190, 80, 20);

        l14 = new JLabel("--Qualifications--");
        l14.setBounds(460, 30, 200, 30);
        l14.setFont(new Font("Times New Roman", Font.BOLD, 25));

        l15 = new JLabel();
        l15.setBounds(460, 80, 90, 20);
        l15.setText("Program:");

        l16 = new JLabel();
        l16.setBounds(570, 80, 90, 20);
        l16.setText("Institution:");

        l17 = new JLabel();
        l17.setBounds(685, 80, 90, 20);
        l17.setText("Grade:");

        l18 = new JLabel();
        l18.setBounds(770, 80, 90, 20);
        l18.setText("Passing year:");

        l19 = new JLabel("--Skills--");
        l19.setBounds(460, 160, 200, 30);
        l19.setFont(new Font("Times New Roman", Font.BOLD, 25));

        l20 = new JLabel();
        l20.setBounds(460, 210, 140, 20);
        l20.setText("Technical skills (Any 2):");

        l21 = new JLabel();
        l21.setBounds(685, 210, 90, 20);
        l21.setText("Languages:");

        l22 = new JLabel("--Projects (Top 2)--");
        l22.setBounds(450, 320, 210, 30);
        l22.setFont(new Font("Times New Roman", Font.BOLD, 24));

        l23 = new JLabel();
        l23.setBounds(460, 370, 120, 20);
        l23.setText("Project names:");

        l24 = new JLabel();
        l24.setBounds(600, 370, 120, 20);
        l24.setText("Technology used:");

        l25 = new JLabel();
        l25.setBounds(750, 370, 120, 20);
        l25.setText("Duration Days:");

        l26 = new JLabel("--Photo (Passport Size)--");
        l26.setBounds(40, 350, 300, 30);
        l26.setFont(new Font("Times New Roman", Font.BOLD, 24));

        ImageIcon img4 = new ImageIcon("frame-removebg-preview.png");
        Image img5 = img4.getImage().getScaledInstance(170, 190, Image.SCALE_DEFAULT);
        ImageIcon img6 = new ImageIcon(img5);
//
//        l27 = new JLabel();
//        l27.setBounds(70, 370, 200, 200);
//        l27.setBackground(new Color(123, 50, 250));
//        l27.setIcon(img6);
//        l27.setOpaque(true);

        l28 = new JLabel("--Experience--");
        l28.setBounds(450, 490, 210, 30);
        l28.setFont(new Font("Times New Roman", Font.BOLD, 24));

        l29 = new JLabel();
        l29.setBounds(460, 530, 140, 20);
        l29.setText("Organization Name:");

        l30 = new JLabel();
        l30.setBounds(630, 530, 140, 20);
        l30.setText("Designation:");

        l31 = new JLabel();
        l31.setBounds(760, 530, 140, 20);
        l31.setText("Exp years:");

        l32 = new JLabel("--Social Profile--");
        l32.setBounds(450, 610, 210, 30);
        l32.setFont(new Font("Times New Roman", Font.BOLD, 24));

        l33 = new JLabel();
        l33.setBounds(460, 650, 140, 20);
        l33.setText("LinkedIn:");

        l34 = new JLabel();
        l34.setBounds(460, 690, 140, 20);
        l34.setText("GitHub:");

        l35 = new JLabel();
        l35.setBounds(70, 410, 200, 250);

        b2 = new JButton();
        b2.setText("Attach Photo");
        b2.setFocusable(false);
        b2.setBounds(100, 670, 120, 20);

        b2.addActionListener(this);


        tf1 = new JTextField();
        tf1.setBounds(130, 80, 200, 20);
        tf1.addActionListener(this);

        tf2 = new JTextField();
        tf2.setBounds(130, 110, 200, 20);
        tf2.addActionListener(this);

        tf3 = new JTextField();
        tf3.setBounds(130, 138, 200, 20);
        tf3.addActionListener(this);

        tf4 = new JTextField();
        tf4.setBounds(565, 110, 100, 20);
        tf4.addActionListener(this);

        tf5 = new JTextField();
        tf5.setBounds(460, 240, 170, 20);
        tf5.addActionListener(this);
        tf6 = new JTextField();
        tf6.setBounds(460, 270, 170, 20);
        tf6.addActionListener(this);

        tf7 = new JTextField();
        tf7.setBounds(680, 240, 170, 20);
        tf7.addActionListener(this);
        tf8 = new JTextField();
        tf8.setBounds(680, 270, 170, 20);
        tf8.addActionListener(this);

        tf9 = new JTextField();
        tf9.setBounds(460, 410, 120, 20);
        tf9.addActionListener(this);

        tf10 = new JTextField();
        tf10.setBounds(600, 410, 120, 20);
        tf10.addActionListener(this);

        tf11 = new JTextField();
        tf11.setBounds(750, 410, 120, 20);
        tf11.addActionListener(this);

        tf12 = new JTextField();
        tf12.setBounds(460, 440, 120, 20);
        tf12.addActionListener(this);

        tf13 = new JTextField();
        tf13.setBounds(600, 440, 120, 20);
        tf13.addActionListener(this);

        tf14 = new JTextField();
        tf14.setBounds(750, 440, 120, 20);
        tf14.addActionListener(this);

        tf15 = new JTextField();
        tf15.setBounds(460, 560, 120, 20);
        tf15.addActionListener(this);
        tf16 = new JTextField();
        tf16.setBounds(615, 560, 120, 20);
        tf16.addActionListener(this);

        tf17 = new JTextField();
        tf17.setBounds(570, 650, 120, 20);
        tf17.addActionListener(this);
        tf18 = new JTextField();
        tf18.setBounds(570, 690, 120, 20);
        tf18.addActionListener(this);

        comboBox1 = new JComboBox(days);
        comboBox1.setBounds(110, 165, 40, 20);
        comboBox1.addActionListener(this);

        comboBox2 = new JComboBox(months);
        comboBox2.setBounds(160, 165, 90, 20);
        comboBox2.addActionListener(this);

        comboBox3 = new JComboBox(years);
        comboBox3.setBounds(260, 165, 70, 20);
        comboBox3.addActionListener(this);

        ta1 = new JTextArea();
        ta1.setBounds(125, 195, 200, 130);
        ta1.addKeyListener(this);

        comboBox4 = new JComboBox(courses);
        comboBox4.setBounds(445, 110, 90, 20);
        comboBox4.addActionListener(this);
        comboBox5 = new JComboBox(grade);
        comboBox5.setBounds(690, 110, 40, 20);
        comboBox5.addActionListener(this);
        comboBox6 = new JComboBox(passingyears);
        comboBox6.setBounds(770, 110, 90, 20);
        comboBox6.addActionListener(this);
        comboBox7 = new JComboBox(expyears);
        comboBox7.setBounds(770, 560, 40, 20);
        comboBox7.addActionListener(this);

        frame2 = new JFrame();
        frame2.setTitle("Credentials Page");
        frame2.setSize(1000, 800);
        frame2.getContentPane().setBackground(new Color(123, 50, 250));
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.add(l8);
        frame2.add(l9);
        frame2.add(l10);
        frame2.add(l11);
        frame2.add(l12);
        frame2.add(l13);
        frame2.add(l14);
        frame2.add(l15);
        frame2.add(l16);
        frame2.add(l17);
        frame2.add(l18);
        frame2.add(l19);
        frame2.add(l20);
        frame2.add(l21);
        frame2.add(l22);
        frame2.add(l23);
        frame2.add(l24);
        frame2.add(l25);
        frame2.add(l26);
//        frame2.add(l27);
        frame2.add(l28);
        frame2.add(l29);
        frame2.add(l30);
        frame2.add(l31);
        frame2.add(l32);
        frame2.add(l33);
        frame2.add(l34);
        frame2.add(b2);
        frame2.add(tf1);
        frame2.add(tf2);
        frame2.add(tf3);
        frame2.add(tf4);
        frame2.add(tf5);
        frame2.add(tf6);
        frame2.add(tf7);
        frame2.add(tf8);
        frame2.add(tf9);
        frame2.add(tf10);
        frame2.add(tf11);
        frame2.add(tf12);
        frame2.add(tf13);
        frame2.add(tf14);
        frame2.add(tf15);
        frame2.add(tf16);
        frame2.add(tf17);
        frame2.add(tf18);
        frame2.add(ta1);
        frame2.add(comboBox1);
        frame2.add(comboBox2);
        frame2.add(comboBox3);
        frame2.add(comboBox4);
        frame2.add(comboBox5);
        frame2.add(comboBox6);
        frame2.add(comboBox7);
    }

    public static void main(String[] args) {
        new frame_2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File selectedfile = fileChooser.getSelectedFile();
                String path = selectedfile.getAbsolutePath();
                l35.setIcon(ResizeImage(path));
                frame2.add(l35);
            }

        }
        if (e.getSource() == tf1) {
            choice1 = tf1.getText();
            System.out.println(choice1);
        }
        if (e.getSource() == tf2) {
            choice2 = tf2.getText();
            System.out.println(choice2);
        }
        if (e.getSource() == tf3) {
            choice3 = tf3.getText();
            System.out.println(choice3);
        }
        if (e.getSource() == comboBox1) {
            int selectedindex = comboBox1.getSelectedIndex();
            choice4 = String.valueOf(comboBox1.getItemAt(selectedindex));
            System.out.println(choice4);
        }
        if (e.getSource() == comboBox2) {
            int selectedindex = comboBox2.getSelectedIndex();
            choice5 = String.valueOf(comboBox2.getItemAt(selectedindex));
            System.out.println(choice5);
        }
        if (e.getSource() == comboBox3) {
            int selectedindex = comboBox3.getSelectedIndex();
            choice6 = String.valueOf(comboBox3.getItemAt(selectedindex));
            System.out.print(choice4 + "/" + choice5 + "/" + choice6);
        }
        if (e.getSource() == comboBox4) {
            int selectedindex = comboBox4.getSelectedIndex();
            choice26 = String.valueOf(comboBox4.getItemAt(selectedindex));
        }
        if (e.getSource() == comboBox5) {
            int selectedindex = comboBox5.getSelectedIndex();
            choice8 = String.valueOf(comboBox5.getItemAt(selectedindex));
            System.out.println(choice8);
        }
        if (e.getSource() == comboBox6) {
            int selectedindex = comboBox6.getSelectedIndex();
            choice9 = String.valueOf(comboBox6.getItemAt(selectedindex));
            System.out.println(choice9);
        }
        if (e.getSource() == tf4) {
            choice10 = tf4.getText();
            System.out.println(choice10);
        }
        if (e.getSource() == tf5) {
            choice11 = tf5.getText();
            System.out.println(choice11);
        }
        if (e.getSource() == tf6) {
            choice12 = tf6.getText();
            System.out.println(choice12);
        }
        if (e.getSource() == tf7) {
            choice13 = tf7.getText();
            System.out.println(choice13);
        }
        if (e.getSource() == tf8) {
            choice14 = tf8.getText();
            System.out.println(choice14);
        }
        if(e.getSource() == tf9){
            choice15 = tf9.getText();
            System.out.println(choice15);
        }
        if (e.getSource() == tf10){
            choice16 = tf10.getText();
            System.out.println(choice16);
        }
        if (e.getSource() == tf11){
            choice17 = tf11.getText();
            System.out.println(choice17);
        }
        if(e.getSource() == tf12){
            choice18 = tf12.getText();
            System.out.println(choice18);
        }
        if (e.getSource() == tf13){
            choice19 = tf13.getText();
            System.out.println(choice19);
        }
        if(e.getSource() == tf14){
            choice20 = tf14.getText();
            System.out.println(choice20);
        }
        if(e.getSource() == tf15){
            choice21 = tf15.getText();
            System.out.println(choice21);
        }
        if(e.getSource() == tf16){
            choice22 = tf16.getText();
            System.out.println(choice22);
        }
        if(e.getSource() == comboBox7){
            int selectedindex = comboBox7.getSelectedIndex();
            choice23 = String.valueOf(comboBox7.getItemAt(selectedindex));
            System.out.println(choice23);
        }
        if(e.getSource() == tf17){
            choice24 = tf17.getText();
            System.out.println(choice24);
        }
        if(e.getSource() == tf18){
            choice25 = tf18.getText();
            System.out.println(choice25);
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {
        choice7 = ta1.getText();
        System.out.println(choice7);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        choice7 = ta1.getText();
        System.out.println(choice7);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        choice7 = ta1.getText();
        System.out.println(choice7);
    }
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon Myimage = new ImageIcon(ImagePath);
        Image img = Myimage.getImage();
        Image newImg = img.getScaledInstance(l35.getWidth(),l35.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newImg);
        return image;
    }
}
