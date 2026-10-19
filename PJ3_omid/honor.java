import java.awt.*;
import javax.swing.*;
//Random

public class honor {


    public honor(){
        JFrame window = new JFrame("List of Honor");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize( 800 , 790);
        window.setLocationRelativeTo(null);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(153, 255, 153));
        window.add(main);


        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(200, 50));
        top.setBackground(null);
        main.add(top, BorderLayout.NORTH);
        
        JLabel Game_Name = new JLabel("List of Honor", JLabel.CENTER);
        Game_Name.setFont(new Font("Serif", Font.BOLD, 36));
        top.add(Game_Name, BorderLayout.CENTER);

        JPanel gamebox = new JPanel(new GridLayout(1,5));
        gamebox.setBackground(Color.WHITE);
        gamebox.setLayout(new GridLayout(6, 6, 5, 5));
        gamebox.setSize(new Dimension(500,500));
        main.add(gamebox, BorderLayout.CENTER);

        JPanel leftJPanel = new JPanel();
        leftJPanel.setPreferredSize(new Dimension(50, 100));
        leftJPanel.setBackground(null);
        main.add(leftJPanel, BorderLayout.WEST);

        JPanel rightJPanel = new JPanel();
        rightJPanel.setPreferredSize(new Dimension(50, 100));
        rightJPanel.setBackground(null);
        main.add(rightJPanel, BorderLayout.EAST);

        JPanel downJpanel = new JPanel();
        downJpanel.setPreferredSize(new Dimension(100, 50));
        downJpanel.setBackground(null);
        main.add(downJpanel, BorderLayout.SOUTH);

        window.setVisible(true);

    }


}
