package com.liangquan.JDK8_Source.a01_Lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName：JFrame
 * @Author: liangquan
 * @Date: 2024/9/27 18:18
 * @Description: Jframe中的Lambda表达式
 */
public class SwingTest {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My Frame");
        JButton jButton = new JButton();
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("button clicked");
            }
        });

        jFrame.add(jButton);
    }

}
