import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Play extends JFrame {
	private JButton startButton;
    public Play() {
        setTitle("Sudoku Game Menu");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

     // Create Start button
        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
        add(startButton);
    }

    private void startGame() {
        // Start the Sudoku game by creating an instance of the Grid class
        Main main = new Main();
        SwingUtilities.invokeLater(() -> {
            new Grid(main.getBoard());
        });
        main.Start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Play().setVisible(true);
        });
    }
}
