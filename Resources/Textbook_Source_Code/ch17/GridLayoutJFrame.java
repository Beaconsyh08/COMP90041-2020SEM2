
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class GridLayoutJFrame extends JFrame
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    public static void main(String[] args)
    {
        GridLayoutJFrame gui = new GridLayoutJFrame(2, 3);
        gui.setVisible(true);
    }

    public GridLayoutJFrame(int rows, int columns )
    {
        super( );
        setSize(WIDTH, HEIGHT);
        setTitle("GridLayout Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(rows, columns ));

        JLabel label1 = new JLabel("First label");
        add(label1);

        JLabel label2 = new JLabel("Second label");
        add(label2);

        JLabel label3 = new JLabel("Third label");
        add(label3);

        JLabel label4 = new JLabel("Fourth label");
        add(label4);

        JLabel label5 = new JLabel("Fifth label");
        add(label5);
    }
}
