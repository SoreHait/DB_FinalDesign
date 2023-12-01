package UIClasses;
import javax.swing.*;
import java.awt.*;

public class UserUI extends JPanel {
    private JButton Return;
    private JPanel UserPanel;
    private JPanel pane1;

    public UserUI() {
        add(pane1);
        setVisible(true);
        Return.setIcon(new ImageIcon("image/exit.png"));
        Return.addActionListener(e -> {
        });
    }
}
