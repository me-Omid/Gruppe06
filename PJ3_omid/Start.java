
import java.awt.*;
import javax.swing.*;

public class Start {
    public static void main(String[] args) {

        JFrame window = new JFrame("Startseite");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 350);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JPanel mainpanel = new JPanel(new BorderLayout());
        mainpanel.setBackground(new Color(153, 255, 153));
        window.add(mainpanel);

        // Titel oben zentriert
        JLabel Game_Name = new JLabel("MemX", JLabel.CENTER);
        Game_Name.setFont(new Font("Serif", Font.BOLD, 36));
        mainpanel.add(Game_Name, BorderLayout.NORTH);

        // Mittlerer Bereich
        JPanel midpanel = new JPanel(new GridBagLayout());
        midpanel.setBackground(null);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(
            new BorderLayout(10,10)
        );
        buttonPanel.setBackground(Color.red);
        buttonPanel.setOpaque(false);

        Dimension buttDimension = new Dimension(150, 30);

        JButton Start = new JButton("Start");
        Start.setBackground(Color.WHITE);
        Start.setAlignmentX(Component.CENTER_ALIGNMENT);
        Start.setPreferredSize(buttDimension);
        Start.setFocusPainted(false);
        Start.addActionListener(e ->{
        new Game(3);
        window.dispose();});

        JButton info = new JButton("Beschreibung");
        info.setBackground(Color.WHITE);
        info.setAlignmentX(Component.CENTER_ALIGNMENT);
        info.setPreferredSize(buttDimension);
        info.setFocusPainted(false);
        info.addActionListener(e ->{
        new info();
        });
        buttonPanel.add(Start, BorderLayout.NORTH);
        buttonPanel.add(info, BorderLayout.CENTER);


        JButton exit = new JButton("Verlassen");
        exit.setBackground(Color.WHITE);
        exit.setSize(new Dimension(100, 100));
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        exit.setPreferredSize(buttDimension);
        exit.setFocusPainted(false);
        exit.addActionListener(e ->{
            System.exit(0);
        });;
        buttonPanel.add(exit, BorderLayout.SOUTH);

        midpanel.add(buttonPanel);
        mainpanel.add(midpanel, BorderLayout.CENTER);

        // Entwicklertext unten zentriert
        JLabel devcredit = new JLabel(
            "PJ3: Gruppe 6 - Omid -", JLabel.LEFT);
        mainpanel.add(devcredit, BorderLayout.SOUTH);

    }
}

