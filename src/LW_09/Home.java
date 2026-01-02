package LW_09;

import LW_08.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {

    public Home() {
        JFrame frame = new JFrame("Name and Address");
        frame.setBounds(10, 10, 600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(20, 20, 80, 30);
        backBtn.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(backBtn);

        JLabel homeLbl = new JLabel("Home");
        homeLbl.setBounds(260, 20, 600, 50);
        homeLbl.setFont(new Font("Arial", Font.BOLD, 24));
        homeLbl.setForeground(Color.BLUE);
        frame.add(homeLbl);

        ImageIcon originalIcon = new ImageIcon("src/resources/image/home.jfif");
        Image img = originalIcon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(img);

        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(50, 100, 500, 500);
        frame.add(imageLabel);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Main.main(null);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Home();
    }
}
