import java.awt.*;
import javax.swing.*;
public class honor {
    public honor(){
        JFrame window = new JFrame("Gewonnen");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 350);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(153, 255, 153));
        window.add(main);

        JLabel Game_Name = new JLabel("NOOO WAAY You really did that?", JLabel.CENTER);
        Game_Name.setFont(new Font("Serif", Font.BOLD, 36));
        main.add(Game_Name, BorderLayout.NORTH);



        JButton exit = new JButton("Verlassen");
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        main.add(exit, BorderLayout.CENTER);

        exit.addActionListener(e ->{
            new Start();
            window.dispose();
        });



    }    
}
