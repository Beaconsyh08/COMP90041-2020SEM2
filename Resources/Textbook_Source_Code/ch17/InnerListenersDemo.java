
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InnerListenersDemo extends JFrame
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    private class RedListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            redPanel.setBackground(Color.RED);
        }
    } //End of RedListener inner class

    private class WhiteListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            whitePanel.setBackground(Color.WHITE);
        }
    } //End of WhiteListener inner class

    private class BlueListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            bluePanel.setBackground(Color.BLUE);
        }
    } //End of BlueListener inner class

    public static void main(String[] args)
    {
        InnerListenersDemo gui = new InnerListenersDemo( );
        gui.setVisible(true);
    }

    public InnerListenersDemo( )
    {
        super("Menu Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));

        redPanel = new JPanel( );
        redPanel.setBackground(Color.LIGHT_GRAY);
        add(redPanel);

        whitePanel = new JPanel( );
        whitePanel.setBackground(Color.LIGHT_GRAY);
        add(whitePanel);

        bluePanel = new JPanel( );
        bluePanel.setBackground(Color.LIGHT_GRAY);
        add(bluePanel);

        JMenu colorMenu = new JMenu("Add Colors");

        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(new RedListener( ));
        colorMenu.add(redChoice);

        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(new WhiteListener( ));
        colorMenu.add(whiteChoice);

        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(new BlueListener( ));
        colorMenu.add(blueChoice);

        JMenuBar bar = new JMenuBar( );
        bar.add(colorMenu);
        setJMenuBar(bar);
    }

}
