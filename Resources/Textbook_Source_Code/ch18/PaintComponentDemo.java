
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Color;

public class PaintComponentDemo extends JFrame
{
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 400;

    private class FancyPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            setBackground(Color.YELLOW);
            g.drawOval(FRAME_WIDTH/4, FRAME_HEIGHT/8,
                       FRAME_WIDTH/2, FRAME_HEIGHT/6);
        }
    }

    public static void main(String[] args)
    {
        PaintComponentDemo w = new PaintComponentDemo( );
        w.setVisible(true);
    }

    public PaintComponentDemo( )
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("The Oval Is in a Panel");
        setLayout(new GridLayout(2, 1));
        FancyPanel p = new FancyPanel( );
        add(p);
        JPanel whitePanel = new JPanel( );
        whitePanel.setBackground(Color.WHITE);
        add(whitePanel);
    }
}
