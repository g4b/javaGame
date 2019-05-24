import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel {
    public static Ball myBall;
    public static Player myPlayer;
    public static Opponent myOppo;
    public static int myLives;

    public Game (Ball ball, Player player, Opponent opponent /*int lives*/) {
        myBall = ball;
        myPlayer = player;
        myOppo = opponent;
        // myLives = lives;

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
                myPlayer.keyReleased(e);
                myOppo.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                myPlayer.keyPressed(e);
                myOppo.keyPressed(e);
            }
        });
        setFocusable(true);
    }
    public void move() {
        myPlayer.move();
        myOppo.move();
        myBall.move();
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);
        myPlayer.paint(g2d);
        myOppo.paint(g2d);
        myBall.paint(g2d);
    }

    /*public void countLives(){
        myLives--;
        if (myLives == 0) {
            System.exit(0);
        }
    }*/
}