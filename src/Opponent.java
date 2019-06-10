import java.awt.event.*;

public class Opponent extends Player {

    public Opponent(int y) {
        super(y);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            xa = -3;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            xa = 3;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            ya = -3;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            ya = 3;
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            xa = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            xa = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            ya = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            ya = 0;
        }
    }
}
