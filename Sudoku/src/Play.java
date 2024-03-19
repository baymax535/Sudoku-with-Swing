import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Play extends JFrame {
	private JButton startEasyButton, startMediumButton, quitButton;
    public Play() {
        setTitle("Sudoku Game Menu");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));
     // Create Start button
        startEasyButton = new JButton("Start Easy");
        startEasyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame(0);
            }
        });
        add(startEasyButton);
        
     // Create Start button
        startMediumButton = new JButton("Start Medium");
        startMediumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame(1);
            }
        });
        add(startMediumButton);
        
     // Create Quit button
        quitButton = new JButton("Quit");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the window
            }
        });
        add(quitButton);
    }

    private void startGame(int x) {
    	if(x==0) {
    	Main main = new Main();
        SwingUtilities.invokeLater(() -> {
            new Grid(main.getBoard());
        });
        main.Start();
    	}
    	else if(x==1) {
            JOptionPane.showMessageDialog(Play.this, "Under Development, Try Easy Mode");
            Main main = new Main();
            SwingUtilities.invokeLater(() -> {
                new MediumGrid(main.getMediumBoard());
            });
            main.Start();
    	}
    }
}
