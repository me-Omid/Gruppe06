import java.awt.*;
import javax.swing.*;
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
    "• MemX ist ein Gedächtnisspiel, bei dem Zahlen und " +
    "ihre Positionen gemerkt werden müssen.\n\n" +
    "• Zu Beginn jeder Runde werden mehrere Kästchen mit " +
    "Zahlen angezeigt.\n\n" +
    "• Beim ersten Klick verschwinden die Zahlen.\n\n" +
    "• Anschließend müssen die Kästchen in aufsteigender " +
    "Reihenfolge angeklickt werden, beginnend mit der " +
    "kleinsten Zahl.\n\n" +
    "• Mit jeder erfolgreich abgeschlossenen Runde steigt " +
    "die Schwierigkeit, da weitere Kästchen hinzukommen."
);

        describtion.setBackground(null);
        describtion.setLineWrap(true);
        describtion.setWrapStyleWord(true);
        describtion.setEditable(false);
        describtion.setOpaque(false);
        describtion.setFont(new Font("Arial", Font.PLAIN, 16));
        main.add(describtion, BorderLayout.CENTER);

        JPanel back_button = new JPanel(new BorderLayout());
        back_button.setBackground(null);
        JButton back = new JButton("Zurück");     
        back.setBackground(Color.WHITE);
        back.setMinimumSize(new Dimension(800, 100));
        back.setMaximumSize(new Dimension(800, 100));
        back_button.add(back, BorderLayout.WEST);
    
        back.addActionListener(e ->{
            new Start();
            window.dispose();
        });

        main.add(back_button, BorderLayout.SOUTH);



    }    
}
