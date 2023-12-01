package UIClasses;

import javax.swing.*;
import java.awt.*;

public class MainMenuPanel extends JPanel {

    JButton userBtn = new JButton("个人中心", new ImageIcon("image/user.png"));
    JButton scoreBtn = new JButton("成绩查询", new ImageIcon("image/score.png"));
    JButton courseBtn = new JButton("课程查询", new ImageIcon("image/course.png"));
    JButton choiceBtn = new JButton("选课系统", new ImageIcon("image/choice.png"));
    JButton exitBtn = new JButton("退出系统", new ImageIcon("image/exit.jpg"));

    public MainMenuPanel() {
        this.setLayout(new GridBagLayout());
        this.setSize(800, 600);

        userBtn.addActionListener(e -> {
            JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            mainFrame.setContentPane(new UserPanel());
        });

        scoreBtn.addActionListener(e -> {
            //TODO
        });

        courseBtn.addActionListener(e -> {
            //TODO
        });

        choiceBtn.addActionListener(e -> {
            //TODO
        });

        exitBtn.addActionListener(e -> {
            System.exit(0);
        });

        createUI();
    }

    private void createUI() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(userBtn, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        this.add(scoreBtn, constraints);
        constraints.gridx = 2;
        constraints.gridy = 0;
        this.add(courseBtn, constraints);
        constraints.gridx = 3;
        constraints.gridy = 0;
        this.add(choiceBtn, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        this.add(exitBtn, constraints);
    }
}
