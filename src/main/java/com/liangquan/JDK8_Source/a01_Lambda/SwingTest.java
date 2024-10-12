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
        JButton jButton = new JButton("Click Me");
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("button clicked");
            }
        });

        /** 使用 Lambda 表达式
         * 这里的 event 的类型是 ActionEvent (ActionEvent event) 可以不用写，可以被推断出来
         */
        jButton.addActionListener(event -> {
            System.out.println("button clicked");
        });

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
