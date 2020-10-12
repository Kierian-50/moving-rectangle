import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Rectangles extends JPanel {

    public static ArrayList<Rectangle> rectangles;

    //public static ArrayList<LastPositionRectangle> lastPos;

    Rectangles(ArrayList<Rectangle> rect){
        rectangles = rect;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //ALWAYS call this method first!
        for(Rectangle r : rectangles){
            g.setColor(r.getColor());
            g.fillRect(r.getPosX(), r.getPosY(), (int) r.getWidth(), (int) r.getHeight());
        }
    }

}
