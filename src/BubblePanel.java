import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.util.ArrayList;
public class BubblePanel extends JPanel{
    Random rand = new Random();
    ArrayList<Bubble> bubbleList;
    int size = 25;
    private class Bubble {
        private int x;
        private int y;
        private int size;
        private Color color;
        public Bubble(int newX, int newY, int newSize) {
            x = newX;
            y = newY;
            size = newSize;
            color = new Color(rand.nextInt(256),
                    rand.nextInt(256),
                    rand.nextInt(256) );
        }
        public void draw(Graphics canvas) {
            canvas.setColor(color);
            canvas.fillOval(x - size/2, y-size/2, size, size);
        }
    }
}
