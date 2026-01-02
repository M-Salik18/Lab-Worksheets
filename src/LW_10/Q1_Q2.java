package LW_10;
import javax.swing.*;
import java.awt.*;

public class Q1_Q2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Marks Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        String[] columns = {"Name", "ID", "Marks"};
        Object[][] data = {
                {"Amal", "CS/2022/020", 85},
                {"Nimali", "ET/2022/014", 77},
                {"Kamal", "CT/2022/011", 92}
        };
        JTable table = new JTable(data, columns);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
