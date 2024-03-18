import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Play extends JFrame {
	private JButton startButton, startButton2;
    public Play() {
        setTitle("Sudoku Game Menu");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 4));
     // Create Start button
        startButton = new JButton("Start Easy");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame(0);
            }
        });
        add(startButton);
        
     // Create Start button
        startButton2 = new JButton("Start Medium");
        startButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame(1);
            }
        });
        add(startButton2);
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

    	}
    }
}
