import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;

import java.awt.*;
public class info {
    public info(){
        JFrame window = new JFrame("Info");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 350);
        window.setLocationRelativeTo(null);
        window.setVisible(true);


        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(153, 255, 153));
        window.add(main);

        JLabel Game_Name = new JLabel("MemX", JLabel.CENTER);
        Game_Name.setFont(new Font("Serif", Font.BOLD, 36));
        main.add(Game_Name, BorderLayout.NORTH);

        JTextArea describtion = new JTextArea(
            "MemX ist ein Desktop-Spiel, das auf dem bekannten " +
            "Chimp Test basiert." +
            "In jeder Runde werden dem Spieler Zahlen in " +
            "verschiedenen Kästchen für 10 Sekunden angezeigt. " +
            "Danach verschwinden die Zahlen und der Spieler " +
            "muss die Kästchen in der korrekten aufsteigenden " +
            "Reihenfolge anklicken, um die Runde erfolgreich " +
            "abzuschließen."
        );

        describtion.setBackground(null);
        describtion.setLineWrap(true);
        describtion.setWrapStyleWord(true);
        describtion.setEditable(false);
        describtion.setOpaque(false);
        describtion.setFont(new Font("Arial", Font.PLAIN, 16));
        main.add(describtion, BorderLayout.WEST);

        JButton back = new JButton("Zurück");
        main.add(back, BorderLayout.SOUTH);



    }    
}
