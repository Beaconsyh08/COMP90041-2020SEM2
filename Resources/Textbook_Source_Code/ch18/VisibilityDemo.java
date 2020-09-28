
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VisibilityDemo extends JFrame
                            implements ActionListener
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private JLabel wavingLabel;
    private JLabel standingLabel;

    public static void main(String[] args)
    {
        VisibilityDemo demoGui = new VisibilityDemo( );
        demoGui.setVisible(true);
    }

    public VisibilityDemo( )
    {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Visibility Demonstration");

        setLayout(new BorderLayout( ));

        JPanel picturePanel = new JPanel( );
        picturePanel.setBackground(Color.WHITE);
        picturePanel.setLayout(new FlowLayout( ));

        ImageIcon dukeStandingIcon =
                  new ImageIcon("duke_standing.gif");
        standingLabel = new JLabel(dukeStandingIcon);
        standingLabel.setVisible(true);
        picturePanel.add(standingLabel);

        ImageIcon dukeWavingIcon = new ImageIcon("duke_waving.gif");
        wavingLabel = new JLabel(dukeWavingIcon);
        wavingLabel.setVisible(false);
        picturePanel.add(wavingLabel);

        add(picturePanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout( ));

        JButton waveButton = new JButton("Wave");
        waveButton.addActionListener(this);
        buttonPanel.add(waveButton);

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        buttonPanel.add(stopButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand( );

        if (actionCommand.equals("Wave"))
        {
            wavingLabel.setVisible(true);
            standingLabel.setVisible(false);
        }
        else if (actionCommand.equals("Stop"))
        {
            standingLabel.setVisible(true);
            wavingLabel.setVisible(false);
        }
        else
            System.out.println("Unanticipated error.");
    }
}
