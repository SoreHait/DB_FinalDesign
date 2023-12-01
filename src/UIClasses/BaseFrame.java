package UIClasses;

import javax.swing.*;

public class BaseFrame extends JFrame {

    public BaseFrame() {
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("学生选课系统");
        this.setContentPane(new MainMenuPanel());
    }
}
