

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;


public class JColorChooserDemo extends JFrame
                               implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private Color sampleColor = Color.LIGHT_GRAY;


    public static void main(String[] args)
    {
        JColorChooserDemo gui = new JColorChooserDemo( );
        gui.setVisible(true);
    }

    public JColorChooserDemo( )
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane( ).setBackground(sampleColor);
        setLayout(new BorderLayout( ));
        setTitle("JColorChooser Demo");
        setSize(WIDTH, HEIGHT);
        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new FlowLayout( ));
        JButton chooseButton = new JButton("Choose a Color");
        chooseButton.addActionListener(this);
        buttonPanel.add(chooseButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getActionCommand( ).equals("Choose a Color"))
        {
            sampleColor = 
               JColorChooser.showDialog(this, "JColorChooser", sampleColor);
            if (sampleColor != null)//If a color was chosen
                getContentPane( ).setBackground(sampleColor);
        }
        else 
            System.out.println("Unanticipated Error");
    }
}
