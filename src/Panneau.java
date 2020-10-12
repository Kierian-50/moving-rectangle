import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * This method is the main part of the application, because
 * it will create the frame and call the logical function of
 * the app.
 */
public class Panneau extends JFrame implements KeyListener, MouseListener {

    /**
     * The frame.
     */
    static JFrame theFrame;

    /**
     * The constructor of the class.
     */
    public Panneau(){
        initWindows();
    }

    /**
     * This private method allows to initialize the frame
     * which is here a static attribute.
     */
    private synchronized void initWindows() {
        //The variable theFrame take the adress of the JFrame of the class.
        theFrame = this;

        //Creation of the rectangles
        Rectangle rectangle = new Rectangle(0,0,50,50,Color.BLACK);
        Rectangle rectangle1 = new Rectangle(400,400,50,50,Color.BLACK);

        //Put the rectangles in an arrayList
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle);
        rectangles.add(rectangle1);

        //Add the JPanel with the rectangles.
        theFrame.getContentPane().add(new Rectangles(rectangles));

        //Launch the thread and the movement of the rectangle
        rectangle.thread.start();
        rectangle1.thread.start();

        //GUI part
        theFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        theFrame.setTitle("Collision");
        theFrame.setVisible(true);
        theFrame.setSize(new Dimension(600,600));
        theFrame.addKeyListener(this);
        theFrame.addMouseListener(this);
    }

    public void createRectangle(){
        //TODO Create the method which create the rectangle
    }


    /**
     * This listener will perform when the user press a key
     * on his keyboard and will perform only when he releases
     * it.
     * @param e The key event.
     */
    @Override
    public synchronized void keyTyped(KeyEvent e) {
        //TODO Find how to stop the rectangle's thread when a key is types.
    }

    /**
     * This listener will perform when the user press his
     * keyboard and will perform the instructions of the
     * method.
     * @param e The key event.
     */
    @Override
    public void keyPressed(KeyEvent e) {
    }

    /**
     * The listener will perform only when the user will release
     * his key after pressed it, and it will perform the method.
     * @param e The key event.
     */
    @Override
    public void keyReleased(KeyEvent e) {
    }

    /**
     * The listener which waits that the user click on the
     * mouse and released the button before to do the method.
     * @param e The mouse event.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        //TODO Find how to stop the rectangle's thread when there is a click.
    }

    /**
     * The listener which listens that the user clicks
     * on the mouse. If the user clicks and don't releases
     * it, it will do the method.
     * @param e The mouse event.
     */
    @Override
    public void mousePressed(MouseEvent e) {
    }

    /**
     * The listener that listens if the user has released
     * the button click after a click on the mouse. In this
     * case, it will do the method.
     * @param e The mouse event.
     */
    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /**
     * This method listens if the mouse enters in the frame
     * of our application. If the mouse enters in the windows
     * it does the method.
     * @param e The mouse event.
     */
    @Override
    public void mouseEntered(MouseEvent e) {
    }

    /**
     * This method listens if the mouse goes outside the frame
     * of our application. If the mouse leaves the windows it
     * does the method.
     *
     * @param e The mouse event.
     */
    @Override
    public void mouseExited(MouseEvent e) {
    }
}

