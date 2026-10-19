import java.awt.*;
import javax.swing.*;
public class win {
    public win(int amount){
        JFrame window = new JFrame("Gewonnen");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 350);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JPanel main = new JPanel(new BorderLayout(0, 90));
        main.setBackground(new Color(153, 255, 153));
        window.add(main);

        JPanel north = new JPanel(new BorderLayout(0, 0));
        north.setBackground(null);
        main.add(north, BorderLayout.NORTH);
        JPanel south = new JPanel(new BorderLayout());
        main.add(south, BorderLayout.SOUTH);
        JPanel west = new JPanel(new BorderLayout());
        main.add(west, BorderLayout.WEST);
        JPanel east = new JPanel(new BorderLayout());
        main.add(east, BorderLayout.EAST);
        JPanel center = new JPanel(new BorderLayout());
        center.setBackground(null);
        main.add(center, BorderLayout.CENTER);

        JLabel Game_Name = new JLabel("Gewonnen!", JLabel.CENTER);
        Game_Name.setFont(new Font("Serif", Font.BOLD, 36));
        Game_Name.setBackground(null);
        north.add(Game_Name);


        Dimension buttDimension = new Dimension(150, 30);
        JPanel againpanel = new JPanel();
        againpanel.setBackground(null);
        JButton again = new JButton("Nächste Runde");
        again.setAlignmentX(Component.CENTER_ALIGNMENT);
        again.setBackground(Color.WHITE);
        again.setPreferredSize(buttDimension);
        again.setMinimumSize(new Dimension(800, 100));
        again.setMaximumSize(new Dimension(800, 100));
        again.setFocusPainted(false);
        again.addActionListener(e ->{
            new Game(amount + 2);
            window.dispose();
        });
        center.add(againpanel, BorderLayout.NORTH);
        againpanel.add(again, BorderLayout.CENTER);

        JPanel exitpanel = new JPanel();
        exitpanel.setBackground(null);
        JButton exit = new JButton("Verlassen");
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        exit.setBackground(Color.WHITE);
        exit.setPreferredSize(buttDimension);
        exit.setMinimumSize(new Dimension(800, 100));
        exit.setMaximumSize(new Dimension(800, 100));
        exit.setFocusPainted(false);
        center.add(exitpanel, BorderLayout.CENTER);
        exitpanel.add(exit, BorderLayout.CENTER); 
        exit.addActionListener(e ->{
            new Start();
            window.dispose();
        });

    }    
}
