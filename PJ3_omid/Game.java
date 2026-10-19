import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.*;
//Random

public class Game {
    private int clickedindex = 0;
    private boolean firstclick = false;
    private JPanel gamebox;

    public Game(int amount){
        JFrame window = new JFrame("Spiel");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize( 800 , 790);
        window.setLocationRelativeTo(null);

        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(new Color(153, 255, 153));
        window.add(main);


        JLabel Game_Name = new JLabel("MemX", JLabel.CENTER);
        Game_Name.setFont(new Font("Serif", Font.BOLD, 36));
        main.add(Game_Name, BorderLayout.NORTH);

        gamebox = new JPanel();
        gamebox.setBackground(null);
        gamebox.setLayout(new GridLayout(6, 6, 5, 5));
        gamebox.setSize(new Dimension(500,500));
        main.add(gamebox, BorderLayout.CENTER);

        Random r = new Random();
        int[] sortednumbers = new int[amount];
        ArrayList<Integer> numbers = new ArrayList<>();

        // Liste mit den zahlen vermischt 
        for(int i = 1; i <= amount; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        // zum Vergleichen mit den angeclickten zahlen
        for(int n = 1; n <= amount; n++){
            sortednumbers[n - 1] = n;
            System.out.println(n);
        }

        // Zähler für zahlen die platziert wurden auf GUI
        int setnumberscounter = 0;
        // Anzahl der Boxen innerhalb des Grids
        int amountboxes = 36;

        // Anzahl Zufällig Leere Kästchen zwischen Zahlen 
        int countrandom = 2;

        // Wenn Amount Klein ist mehr Zufällig Leere Kästchen damit 
        // die Kästchen besser verteilt werden
        if(amount < 9){
            countrandom = 3;
        }

        
        //Schleife zum Platzieren der Kästchen
        for(int i = 1; i <= 36; i++){
            int rand = r.nextInt(countrandom);
            int index = setnumberscounter;
            System.out.println(rand);
            if(rand == 1 || rand == 2){
                gamebox.add(new JPanel(){{setBackground(null);}});
            }else if(setnumberscounter < amount){
                gamebox.add(new JButton(String.valueOf(numbers.get(index))){{
                    setBackground(Color.WHITE);
                    addActionListener(e ->{
                        

                        firstclick = true;
                        if(sortednumbers[clickedindex] == amount && amount == 15){
                            new honor();
                        }
                        else if(sortednumbers[clickedindex] == amount){
                            new win(amount);
                            window.dispose();
                        }
                        else if(sortednumbers[clickedindex] == numbers.get(index)){
                            System.out.println(clickedindex);
                            clickedindex++;
                        }
                        else{
                            new lose(amount);
                            window.dispose();
                        }
                    });
                }});

                setnumberscounter++;
                
            }
            else{
                gamebox.add(new JPanel(){{setBackground(null);}});
            }
        }

        if(firstclick){
            System.out.println("Jaman");
        }


        Timer timer = new Timer(100, e -> {
            if(firstclick){
                hide(gamebox);

            }
        });
        if(firstclick){
            timer.setRepeats(false);
        }else{
            timer.setRepeats(true);
        }
        timer.start();


        window.setVisible(true);

    }


    public static void hide(JPanel gamebox){
            for (Component c : gamebox.getComponents()) {
                if (c instanceof JButton b) {
                b.setText(""); // Button-Text entfernen
            }
        }
    }
}
