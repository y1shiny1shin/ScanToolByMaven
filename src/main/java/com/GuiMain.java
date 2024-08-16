package com;

import com.Utils.ButtonBuffer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GuiMain {
    public JFrame frame = new JFrame("SimpleBox By y1shin");
    public void launch() throws IOException {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1)); // 方框纵向排列

        // 综合漏扫工具
        JPanel scanBox = new JPanel(new FlowLayout()); // 按钮横向排列
        scanBox.setBorder(BorderFactory.createTitledBorder("综合漏洞扫描"));
        String scanClassName = "com.CmdRun.IntegrateTool";
        scanBox.add(new ButtonBuffer().getButton("oa综合利用工具" ,scanClassName ,"oaExpTools"));
        scanBox.add(new ButtonBuffer().getButton("神机综合利用工具" ,scanClassName ,"SJ19"));
        scanBox.add(new ButtonBuffer().getButton("RuoYi管理系统综合利用" ,scanClassName ,"RuoYiExploit"));
        scanBox.add(new ButtonBuffer().getButton("Hvv2023",scanClassName ,"HVV2023"));
        frame.add(scanBox);

        // 信息收集工具
        JPanel collectBox = new JPanel(new FlowLayout()); // 按钮横向排列
        collectBox.setBorder(BorderFactory.createTitledBorder("信息收集"));
        String collectClassName = "com.CmdRun.InfoCollect";

        frame.add(collectBox);

        // Shell链接工具
        JPanel shellBox = new JPanel(new FlowLayout());
        shellBox.setBorder(BorderFactory.createTitledBorder("Shell链接工具"));
        String shellClassName = "com.CmdRun.ShellConn";

        frame.add(shellBox);

        // 框架扫描工具
        JPanel frameBox = new JPanel(new FlowLayout());
        frameBox.setBorder(BorderFactory.createTitledBorder("框架扫描工具"));
        String frameClassName = "com.CmdRun.FrameScan";

        frame.add(frameBox);

        // 数据库工具
        JPanel dbBox = new JPanel(new FlowLayout());
        dbBox.setBorder(BorderFactory.createTitledBorder("数据库"));
        String dbClassName = "com.CmdRun.DbScan";

        frame.add(dbBox);

        // 分析工具
        JPanel AnalyzeBox = new JPanel(new FlowLayout());
        AnalyzeBox.setBorder(BorderFactory.createTitledBorder("分析工具"));
        String AnalyzeClassName = "com.CmdRun.AnalyzeTool";

        frame.add(AnalyzeBox);

        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
