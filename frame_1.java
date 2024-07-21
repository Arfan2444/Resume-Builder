package resume_builder;

import javax.swing.*;
import java.awt.*;

public class frame_1 {
    JFrame frame1;
    JPanel p1;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JButton b1;

    frame_1() {

        ImageIcon img1 = new ImageIcon("header.png");
        Image img2 = img1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);

        l1 = new JLabel();
        l1.setBounds(170, 20, 320, 60);
        l1.setText("Resume Builder");
        l1.setFont(new Font("Comic Sans", Font.BOLD, 35));
        l1.setForeground(Color.red);

        l2 = new JLabel();
        l2.setBounds(20, 80, 160, 160);
        l2.setIcon(img3);
        l2.setLayout(null);

        l3 = new JLabel();
        l3.setBounds(65, 250, 500, 70);
        l3.setText("A resume is a formal document that a job applicant");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 21));

        l4 = new JLabel();
        l4.setBounds(65, 280, 500, 70);
        l4.setText("creates to itemize their qualifications for a position.");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 21));

        l5 = new JLabel();
        l5.setBounds(30, 340, 580, 70);
        l5.setText("A resume is usually accompanied by a customized cover letter");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 21));

        l6 = new JLabel();
        l6.setBounds(30, 370, 600, 70);
        l6.setText("in which the applicant expresses an interest in a specific job or");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 21));

        l7 = new JLabel();
        l7.setBounds(15, 400, 600, 70);
        l7.setText("company and draws attention to the most relevant specifics the resume");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        b1 = new JButton();
        b1.setFocusable(false);
        b1.setText("Start Building Your Resume");
        b1.setBounds(190, 480, 200, 40);

        p1 = new JPanel();
        p1.setOpaque(true);
        p1.setBackground(Color.blue);
        p1.setBounds(5, 5, 595, 575);
        p1.setLayout(null);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(b1);

        frame1 = new JFrame();
        frame1.setTitle("Resume Builder");
        frame1.setResizable(false);
        frame1.setSize(620, 620);
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.add(p1);
        frame1.setVisible(true);
    }

    public static void main(String[] args) {
        new frame_1();
    }
}
