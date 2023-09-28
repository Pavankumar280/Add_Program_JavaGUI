import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ADD {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("d2.png");

        ImageIcon imag=new ImageIcon("d2.png");
        

        JFrame frame = new JFrame("Calculator");
        frame.setSize(420,500);
        frame.setIconImage(imag.getImage());

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(250, 300, image.getIconWidth(), image.getIconHeight());
        panel.add(imageLabel);

        JLabel l3  = new JLabel("ADDITION");
        
        l3.setForeground(Color.blue);

        l3.setBounds(150, 10, 200, 0);
        panel.add(l3);

        JLabel l1  = new JLabel("Number 1:");
        l1.setBounds(100, 100, 100, 25);
        panel.add(l1);

        JTextField t1 = new JTextField(10);
        t1.setFont(new Font("MV Boli", Font.PLAIN,10));

        t1.setBounds(201,100,100,25);
        panel.add(t1);

        JLabel l2  = new JLabel("Number 2:");
        l2.setOpaque(true);
        l2.setBounds(100, 150, 100, 25);
        panel.add(l2);

        JTextField t2 = new JTextField(10);
        t2.setFont(new Font("MV Boli", Font.PLAIN,10));

        t2.setBounds(201,150,100,25);
        panel.add(t2);

        JButton btn = new JButton("ADD");
        btn.setBackground(Color.YELLOW);
        btn.setBounds(201,200,100,25);
        panel.add(btn);

        JLabel result = new JLabel("        ");
        result.setBounds(201,250,100,25);
        result.setForeground(Color.BLUE);
        result.setFont(new Font("MV Boli",Font.BOLD,20));
        panel.add(result);

        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t1.getText());
                int sum = n1 + n2;
                result.setText("sum :" +sum);
                
            }
        });


    }
}
