import java.awt.*;
import javax.swing.*;

public class Game {
    public Game(int amount){
        JFrame window = new JFrame("Info");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize( 800 , 600);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(153, 255, 153));
        main.setLayout(new GridLayout(10, 40, 40, 40));
        window.add(main);


        JLabel Game_Name = new JLabel("MemX", JLabel.CENTER);
        Game_Name.setFont(new Font("Serif", Font.BOLD, 36));
        main.add(Game_Name, BorderLayout.NORTH);

        JPanel gamebox = new JPanel(new GridLayout(4,4));
        gamebox.setBackground(Color.WHITE);
        main.add(gamebox, BorderLayout.CENTER);

        JButton test = new JButton("1");
        gamebox.add(test);

    }
    
}
