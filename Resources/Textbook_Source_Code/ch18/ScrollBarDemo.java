
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ScrollBarDemo extends JFrame
                           implements ActionListener
{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int LINES = 15;
    public static final int CHAR_PER_LINE = 30;


    private JTextArea memoDisplay;
    private String memo1;
    private String memo2;


    public static void main(String[] args)
    {
        ScrollBarDemo gui = new ScrollBarDemo( );
        gui.setVisible(true);
    }


    public ScrollBarDemo( )
    {
        super("Scroll Bars Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout( ));
        JButton memo1Button = new JButton("Save Memo 1"); 
        memo1Button.addActionListener(this);
        buttonPanel.add(memo1Button); 
 
        JButton memo2Button = new JButton("Save Memo 2"); 
        memo2Button.addActionListener(this);
        buttonPanel.add(memo2Button);

        JButton clearButton = new JButton("Clear"); 
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);
 
        JButton get1Button = new JButton("Get Memo 1"); 
        get1Button.addActionListener(this);
        buttonPanel.add(get1Button);

        JButton get2Button = new JButton("Get Memo 2"); 
        get2Button.addActionListener(this);
        buttonPanel.add(get2Button);

        add(buttonPanel, BorderLayout.SOUTH);

        JPanel textPanel = new JPanel( ); 
        textPanel.setBackground(Color.BLUE);

        memoDisplay = new JTextArea(LINES, CHAR_PER_LINE);
        memoDisplay.setBackground(Color.WHITE);

        JScrollPane scrolledText = new JScrollPane(memoDisplay);
        scrolledText.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrolledText.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        textPanel.add(scrolledText);

        add(textPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand( );


        if (actionCommand.equals("Save Memo 1"))
            memo1 = memoDisplay.getText( );
        else if (actionCommand.equals("Save Memo 2"))
            memo2 = memoDisplay.getText( );
        else if (actionCommand.equals("Clear"))
            memoDisplay.setText("");
        else if (actionCommand.equals("Get Memo 1"))
            memoDisplay.setText(memo1);
        else if (actionCommand.equals("Get Memo 2"))
            memoDisplay.setText(memo2);
        else
            memoDisplay.setText("Error in memo interface");
     } 
}
