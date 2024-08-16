package com;

import com.Utils.ButtonBuffer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GuiMain {
    public JFrame frame = new JFrame("RT Tool Box By y1shin");
    public void launch() throws IOException {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1)); // 方框纵向排列

        // 方框1
        JPanel scanBox = new JPanel(new FlowLayout()); // 按钮横向排列
        scanBox.setBorder(BorderFactory.createTitledBorder("漏洞扫描"));
        String scanClassName = "com.CmdRun.GuiScan";
        scanBox.add(new ButtonBuffer().getButton("SpringExploitGui" ,scanClassName ,"SpringExploitGui"));
        frame.add(scanBox);

        // 方框2
        JPanel collectBox = new JPanel(new FlowLayout()); // 按钮横向排列
        collectBox.setBorder(BorderFactory.createTitledBorder("信息收集"));
        // 添加按钮
        frame.add(collectBox);

        JPanel shellBox = new JPanel(new FlowLayout());




        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
