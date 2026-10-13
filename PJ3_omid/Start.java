
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Box;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

public class Start {
    public static void main(String[] args) {

        JFrame window = new JFrame("Startseite");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 350);
        window.setLocationRelativeTo(null);

        JPanel mainpanel = new JPanel(new BorderLayout());
        mainpanel.setBackground(new Color(153, 255, 153));

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

        JButton info = new JButton("Spiel Beschreibung");
        info.setBackground(Color.WHITE);
        info.setAlignmentX(Component.CENTER_ALIGNMENT);
        info.setMinimumSize(new Dimension(300, 40));
        info.setMaximumSize(new Dimension(300, 40));
        info.setFocusPainted(false);
        buttonPanel.add(Start);
        buttonPanel.add(Box.createVerticalStrut(20));
        buttonPanel.add(info);

        midpanel.add(buttonPanel);
        mainpanel.add(midpanel, BorderLayout.CENTER);

        // Entwicklertext unten zentriert
        JLabel devcredit = new JLabel(
            "PJ3: Gruppe 6 - Omid -", JLabel.LEFT);
        mainpanel.add(devcredit, BorderLayout.SOUTH);

        window.add(mainpanel);
        window.setVisible(true);
    }
}

