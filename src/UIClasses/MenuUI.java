package UIClasses;
import javax.swing.*;
import java.awt.*;

public class MenuUI extends JPanel {

    private JPanel StudentUIPanel;
    private JButton UserBtn;
    private JButton ScoreBtn;
    private JButton CourseBtn;
    private JButton ChoiceBtn;
    private JButton ExitBtn;

    public MenuUI() {


        add(StudentUIPanel);
        UserBtn.setIcon(new ImageIcon("image/user.png"));
        UserBtn.addActionListener(e -> {
        });

        ScoreBtn.setIcon(new ImageIcon("image/scoreview.png"));

        CourseBtn.setIcon(new ImageIcon("image/courses.png"));

        ChoiceBtn.setIcon(new ImageIcon("image/choice.png"));

        ExitBtn.setIcon(new ImageIcon("image/exit.jpg"));
        ExitBtn.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.dispose();
            System.exit(0);
        });
    }
}
