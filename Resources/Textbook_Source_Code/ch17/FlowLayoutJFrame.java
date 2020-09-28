
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class FlowLayoutJFrame extends JFrame
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public FlowLayoutJFrame( )
    {
        super( );
        setSize(WIDTH, HEIGHT);
        setTitle("Layout Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout( ));

        JLabel label1 = new JLabel("First label");
        add(label1);

        JLabel label2 = new JLabel("Second label");
        add(label2);

        JLabel label3 = new JLabel("Third label");
        add(label3);
    }
}
