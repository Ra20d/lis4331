import javax.swing.JFrame


public class MultipleSelectionListDemo {
    public static void main( Sring[] args)
    {
        MultipleSelectionFrame multipleSelectionFrame = new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        multipleSelectionFrame.setSize( 450, 150 );
        multipleSelectionFrame( true );
    }
}
