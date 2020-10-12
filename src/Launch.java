public class Launch {

    /**
     * Main entry of the program.
     * @param args The arguments.
     */
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Panneau();
            }
        });
    }

}
