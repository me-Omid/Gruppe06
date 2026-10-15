
import java.awt.*;
import javax.swing.*;

public class Start {
    public static void main(String[] args) {

        JFrame window = new JFrame("Startseite");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 350);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
            new BoxLayout(buttonPanel, BoxLayout.Y_AXIS)
        );
        buttonPanel.setOpaque(false);

        JButton Start = new JButton("Start");
        Start.setBackground(Color.WHITE);
        Start.setAlignmentX(Component.CENTER_ALIGNMENT);
        Start.setMinimumSize(new Dimension(300, 40));
        Start.setMaximumSize(new Dimension(300, 40));
        Start.setFocusPainted(false);
        Start.addActionListener(e ->{
        new Game(3);
        window.dispose();});

        JButton info = new JButton("Spiel Beschreibung");
        info.setBackground(Color.WHITE);
        info.setAlignmentX(Component.CENTER_ALIGNMENT);
        info.setMinimumSize(new Dimension(300, 40));
        info.setMaximumSize(new Dimension(300, 40));
        info.setFocusPainted(false);
        info.addActionListener(e ->{
        new info();
        window.dispose();});
        buttonPanel.add(Start);
        buttonPanel.add(Box.createVerticalStrut(20));
        buttonPanel.add(info);

        midpanel.add(buttonPanel);
        mainpanel.add(midpanel, BorderLayout.CENTER);

        // Entwicklertext unten zentriert
        JLabel devcredit = new JLabel(
            "PJ3: Gruppe 6 - Omid -", JLabel.LEFT);
        mainpanel.add(devcredit, BorderLayout.SOUTH);

    }
}

