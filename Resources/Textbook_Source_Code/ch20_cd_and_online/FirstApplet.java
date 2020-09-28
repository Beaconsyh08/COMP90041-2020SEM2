
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

public class FirstApplet extends JApplet
{
    public void init( )
    {
        getContentPane( ).setBackground(Color.ORANGE);
        setLayout(new BorderLayout( ));
        JLabel aLabel = 
             new JLabel("An applet a day keeps the doctor away.");
        add(aLabel, BorderLayout.CENTER);
    }
}
