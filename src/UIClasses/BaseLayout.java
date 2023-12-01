package UIClasses;
import javax.swing.*;
import java.awt.*;

public class BaseLayout extends JFrame {
    private JPanel BasePanel;
    private CardLayout cardLayout;
    private MenuUI menuUI;
    private UserUI userUI;

    public BaseLayout() {
        cardLayout = new CardLayout();
        BasePanel.setLayout(cardLayout);
        menuUI = new MenuUI();
        ;
        userUI = new UserUI();
        BasePanel.add(menuUI, "menu");
        BasePanel.add(userUI, "user");
        cardLayout.show(BasePanel, "menu");

        setContentPane(BasePanel);
        setTitle("学生界面");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }
}
