package UIClasses;

import javax.swing.*;
import java.awt.*;

public class UserPanel extends JPanel {

    JButton returnBtn = new JButton("返回", new ImageIcon("image/exit.jpg"));
    JButton testBtn = new JButton("测试");
    JLabel testLabel = new JLabel("测试标签");
    Integer a = 0;

    public UserPanel() {
        this.setLayout(new GridBagLayout());
        this.setSize(800, 600);

        returnBtn.addActionListener(e -> {
            JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            mainFrame.setContentPane(new MainMenuPanel());
        });

        testBtn.addActionListener(e -> {
            updateData();
        });

        createUI();
    }

    private void createUI() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(returnBtn, constraints);
        this.add(testBtn);
        this.add(testLabel);
    }

    private void updateData() {
        a++;
        testLabel.setText(a.toString());
    }
}
