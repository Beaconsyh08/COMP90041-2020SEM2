
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;

public class IconApplet extends JApplet
{
    public void init( )
    {
        getContentPane( ).setBackground(Color.YELLOW);
        setLayout(new BorderLayout( ));

        JLabel shift = new JLabel("             ");
        JLabel aLabel = new JLabel("Welcome to my applet.");
        ImageIcon dukeIcon = new ImageIcon("duke_waving.gif");
        aLabel.setIcon(dukeIcon);
        add(shift, BorderLayout.WEST);
        add(aLabel, BorderLayout.CENTER);
    }
}
