import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
    int x = 250;
    int y = 20;
    int xa = 2;
    int ya = 2;
    private Player myPlayer;
    private Opponent myOppo;

    public Ball(Player player, Opponent opponent) {
        myPlayer = player;
        myOppo = opponent;
    }

    public void paint(Graphics2D g) {
        g.fillOval(x,y,20,20);
    }

    public void move() {
        checkCollisions();
        x += xa;
        y += ya;
    }

    public void checkCollisions(){
        Rectangle colRect = new Rectangle(x,y,20,20);
        if(x == 680 || x == 0){
            xa = -xa;
        }
        if(y == 0){
            if (myOppo.lives == 0){
                System.exit(0);
            } else {
                myOppo.lives--;
                ya = -ya;
            }
        }
        if(colRect.intersects(myPlayer.getRectangle()) || colRect.intersects(myOppo.getRectangle())){
            ya = -ya;
        }
        if(y == 680){
            if (myPlayer.lives == 0){
                System.exit(0);
            } else {
                myPlayer.lives--;
                ya = -ya;
            }
        }
    }
}