package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class KnapsackGUI {
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField2;
    private JTextArea textArea2;

    public KnapsackGUI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int nOfItems = Integer.parseInt(textField1.getText());
                    int seed = Integer.parseInt(textField3.getText());
                    int capacity = Integer.parseInt(textField2.getText());

                    Problem p1 = new Problem(1, 10, nOfItems, seed);
                    Result r1 = p1.solve(capacity);
                    textArea1.setText(r1.toString());
                    textArea2.setText(p1.toString());
                } catch (NumberFormatException ex) {
                    //throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("KnapsackGUI");
        frame.setContentPane(new KnapsackGUI().panel1);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        panel1.setMinimumSize(new Dimension(300, 300));
        panel1.setPreferredSize(new Dimension(300, 200));
        button1 = new JButton();
        button1.setText("Run");
        panel1.add(button1, BorderLayout.WEST);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout(0, 0));
        panel1.add(panel2, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        label1.setText("Number of items:");
        panel2.add(label1, BorderLayout.NORTH);
        textField1 = new JTextField();
        panel2.add(textField1, BorderLayout.CENTER);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(0, 0));
        panel2.add(panel3, BorderLayout.SOUTH);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout(0, 0));
        panel3.add(panel4, BorderLayout.CENTER);
        final JLabel label2 = new JLabel();
        label2.setText("Seed:");
        panel4.add(label2, BorderLayout.NORTH);
        textField3 = new JTextField();
        textField3.setText("");
        panel4.add(textField3, BorderLayout.CENTER);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new BorderLayout(0, 0));
        panel4.add(panel5, BorderLayout.SOUTH);
        final JLabel label3 = new JLabel();
        label3.setText("Capacity:");
        panel5.add(label3, BorderLayout.NORTH);
        textField2 = new JTextField();
        panel5.add(textField2, BorderLayout.CENTER);
        final JScrollPane scrollPane1 = new JScrollPane();
        panel1.add(scrollPane1, BorderLayout.CENTER);
        textArea1 = new JTextArea();
        scrollPane1.setViewportView(textArea1);
        final JScrollPane scrollPane2 = new JScrollPane();
        panel1.add(scrollPane2, BorderLayout.EAST);
        textArea2 = new JTextArea();
        scrollPane2.setViewportView(textArea2);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    public class MyTextArea extends JTextArea {

        private Image img;

        public MyTextArea(int a, int b) {
            super(a, b);
            try {
                img = ImageIO.read(new File("C:/Users/Drago/IdeaProjects/Plecak/src/derg.jpg"));
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(img, 0, 0, null);
            super.paintComponent(g);
        }
    }

}

