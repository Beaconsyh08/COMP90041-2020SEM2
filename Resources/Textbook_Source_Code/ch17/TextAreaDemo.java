
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextAreaDemo extends JFrame
                          implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int NUMBER_OF_LINES = 10;
    public static final int NUMBER_OF_CHAR = 30;

    private JTextArea story;

    public static void main(String[] args)
    {
        TextAreaDemo gui = new TextAreaDemo( );
        gui.setVisible(true);
    }

    public TextAreaDemo( )
    {
        setTitle("Text Area Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        JPanel storyPanel = new JPanel( );
        storyPanel.setLayout(new BorderLayout( ));
        storyPanel.setBackground(Color.WHITE);
        story = new JTextArea(NUMBER_OF_LINES, NUMBER_OF_CHAR);

        storyPanel.add(story, BorderLayout.CENTER);
        JLabel storyLabel = new JLabel("Enter your story here:");
        storyPanel.add(storyLabel, BorderLayout.NORTH);

        add(storyPanel);

        JPanel buttonPanel = new JPanel( );
        buttonPanel.setLayout(new FlowLayout( ));
        buttonPanel.setBackground(Color.PINK);
        JButton actionButton = new JButton("Click me");
        actionButton.addActionListener(this);
        buttonPanel.add(actionButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel);
    }

    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand( );

        if (actionCommand.equals("Click me"))
        {
            int lineCount = getLineCount();
            story.setText("Your story is " 
                                + lineCount + " lines long.");
        }
        else if (actionCommand.equals("Clear"))
            story.setText("");
        else
            story.setText("Unexpected error.");
    }

    private int getLineCount()
    {
        String storyString = story.getText();
        int count = 0;

        for (int i = 0; i < storyString.length(); i++)
            if (storyString.charAt(i) == '\n')
                count++;
        return count + 1;//The last line has no '\n'.
    }
}
