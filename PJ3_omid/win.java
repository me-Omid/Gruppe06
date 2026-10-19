import java.awt.*;
import javax.swing.*;
public class win {
    public win(int win_game_amount){
        JFrame window = new JFrame("Gewonnen");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 350);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(153, 255, 153));
        window.add(main);

        JLabel Game_Name = new JLabel("Gewonnen! JUHOOO", JLabel.CENTER);
        Game_Name.setFont(new Font("Serif", Font.BOLD, 36));
        main.add(Game_Name, BorderLayout.NORTH);

        JPanel Center = new JPanel(new BorderLayout());
        main.add(Center, BorderLayout.CENTER);

        JButton again = new JButton("Nächste Runde");
        again.setAlignmentX(Component.CENTER_ALIGNMENT);
        Center.add(again, BorderLayout.NORTH);

        again.addActionListener(e ->{
            new Game(win_game_amount + 2);
            window.dispose();
        });

        JButton exit = new JButton("Verlassen");
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        Center.add(exit, BorderLayout.CENTER);

        exit.addActionListener(e ->{
            new Start();
            window.dispose();
        });

        JPanel back_button = new JPanel(new BorderLayout());
        back_button.setBackground(null);
        JButton back = new JButton("Zurück");     
        back.setMinimumSize(new Dimension(800, 100));
        back.setMaximumSize(new Dimension(800, 100));
        back_button.add(back, BorderLayout.WEST);
    


        main.add(back_button, BorderLayout.SOUTH);



    }    
}
