package LW_10;

import javax.swing.*;
import java.awt.*;

public class Q3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel with Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setResizable(false);

        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(0, 0, 400, 200);

        JButton saveBtn = new JButton("Save");
        JButton updateBtn = new JButton("Update");
        JButton deleteBtn = new JButton("Delete");

        panel.add(saveBtn);
        panel.add(updateBtn);
        panel.add(deleteBtn);

        frame.add(panel);
        frame.setVisible(true);
    }
}
