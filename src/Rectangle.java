import java.awt.*;

public class Rectangle implements Runnable {

    public Thread thread = new Thread(this);

    /**
     * The color of the rectangle.
     */
    private Color color;

    /**
     * The width of the rectangle.
     */
    private int width;

    /**
     * The height of the rectangle.
     */
    private int height;

    /**
     * The x position of the rectangle.
     * The 0 is in the top left-hand corner.
     */
    private int posX;

    /**
     * The y position of the rectangle.
     * The 0 is in the top left-hand corner.
     */
    private int posY;

    /**
     * The incrementation of the rectangle when it moves according
     * the x axis.
     */
    private int incX = 1;

    /**
     * The incrementation of the rectangle when it moves according
     * the y axis.
     */
    private int incY = 1;

    public Rectangle(int posX, int posY, int width, int height, Color color){
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void run() {
        while (true){

            isBoard();

            posX += incX;
            posY +=incY;

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Panneau.theFrame.repaint();
        }
    }

    private void isBoard(){
        // Find the size of the frame, to find the found
        java.awt.Rectangle r = Panneau.theFrame.getBounds();

        // Find the edges of the frame to avoid that the rectangle
        // exit the frame.
        if(this.posX < 0 || this.posX > r.width-this.width-15){
            this.incX = -this.incX;
        }
        if(this.posY < 0 || this.posY > r.height-this.height-30){
            this.incY = -this.incY;
        }
    }

    public void collision(Rectangle others){
        //TODO Create the method which find the collision
    }

    public Thread getThread() {
        return thread;
    }

    public Color getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getIncX() {
        return incX;
    }

    public int getIncY() {
        return incY;
    }
}
