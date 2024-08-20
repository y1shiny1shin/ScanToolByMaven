package com;

import com.Utils.ButtonBuffer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GuiMain {
    public JFrame frame = new JFrame("SimpleBox");
//    public BackgroundPanel frame = new BackgroundPanel("ayu-dark.png");
    public void launch() throws IOException {

        ImageIcon icon = new ImageIcon("logo_archlinux_22365.ico");

        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 6)); // 方框纵向排列
        frame.setSize(1000, 700); // 根据本人电脑设置，不同电脑可手动设置


        // 综合漏扫工具
        JPanel scanBox = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 按钮横向排列
        scanBox.setBorder(BorderFactory.createTitledBorder("综合漏洞扫描"));
        String scanClassName = "com.CmdRun.IntegrateTool";
        scanBox.add(new ButtonBuffer().getButton("oa综合利用工具" ,scanClassName ,"oaExpTools"));
        scanBox.add(new ButtonBuffer().getButton("神机综合利用工具" ,scanClassName ,"SJ19"));
        scanBox.add(new ButtonBuffer().getButton("RuoYi管理系统综合利用" ,scanClassName ,"RuoYiExploit"));
        scanBox.add(new ButtonBuffer().getButton("Hvv2023",scanClassName ,"HVV2023"));
        scanBox.add(new ButtonBuffer().getButton("IwannaGetAllv1.2",scanClassName,"IwannaGetAll"));
        scanBox.add(new ButtonBuffer().getButton("LiqunKit",scanClassName,"LiqunKit"));
        scanBox.add(new ButtonBuffer().getButton("ThelostWorld_OA",scanClassName,"ThelostWorld_OA"));
        scanBox.add(new ButtonBuffer().getButton("泛微OAExp",scanClassName,"FanWeiOAExp"));
        frame.add(scanBox);

        // 框架扫描工具
        JPanel frameBox = new JPanel(new FlowLayout(FlowLayout.LEFT));
        frameBox.setBorder(BorderFactory.createTitledBorder("框架扫描工具"));
        String frameClassName = "com.CmdRun.FrameScan";
        frameBox.add(new ButtonBuffer().getButton("JBossScan",frameClassName,"JBossScan"));
        frameBox.add(new ButtonBuffer().getButton("SpringBootGui",frameClassName,"SpringBootGui"));
        frameBox.add(new ButtonBuffer().getButton("TomcatAttack",frameClassName,"TomcatAttack"));
        frameBox.add(new ButtonBuffer().getButton("ThinkPHPBybewhale",frameClassName,"ThinkPHP_bybewhale"));
        frameBox.add(new ButtonBuffer().getButton("ThinkPHPRCE",frameClassName,"ThinkPHPRCE"));
        frameBox.add(new ButtonBuffer().getButton("ThinkPHPGUIByLianHua",frameClassName,"ThinkPHPGUI_byLianHua"));
        frameBox.add(new ButtonBuffer().getButton("Struts2Bypass",frameClassName,"Struts2Bypass"));
        frameBox.add(new ButtonBuffer().getButton("Struts2ALL",frameClassName,"Struts2ALL"));
        frameBox.add(new ButtonBuffer().getButton("JenKinsGui",frameClassName,"JenKinsGui"));
        frameBox.add(new ButtonBuffer().getButton("ShiroAttack4.7",frameClassName,"ShiroAttack47"));
        frameBox.add(new ButtonBuffer().getButton("ShiroExploitV2.51",frameClassName,"ShiroExpliot"));
        frameBox.add(new ButtonBuffer().getButton("ShiroWithNoCC",frameClassName,"ShiroWithNoCC"));
        frameBox.add(new ButtonBuffer().getButton("NacosExploitGui",frameClassName,"NacosExploitGui"));
        frameBox.add(new ButtonBuffer().getButton("WebLogicBysp4z",frameClassName,"WebLogicBysp4z"));
        frameBox.add(new ButtonBuffer().getButton("WebLogicBy21superman",frameClassName,"WebLogicBy21superman"));
        frameBox.add(new ButtonBuffer().getButton("WebLogicByKimJun",frameClassName,"WebLogicByKimJun"));
        frame.add(frameBox);

        // 数据库工具
        JPanel dbBox = new JPanel(new FlowLayout(FlowLayout.LEFT));
        dbBox.setBorder(BorderFactory.createTitledBorder("数据库"));
        String dbClassName = "com.CmdRun.DbScan";
        dbBox.add(new ButtonBuffer().getButton("MUDTv2.1.1",dbClassName,"MUDT"));
        dbBox.add(new ButtonBuffer().getButton("oracleShell",dbClassName,"oracleShell"));
        dbBox.add(new ButtonBuffer().getButton("postgresql",dbClassName,"postgresql"));
        frame.add(dbBox);

        // 分析工具
        JPanel AnalyzeBox = new JPanel(new FlowLayout(FlowLayout.LEFT));
        AnalyzeBox.setBorder(BorderFactory.createTitledBorder("分析工具"));
        String AnalyzeClassName = "com.CmdRun.AnalyzeTool";
        AnalyzeBox.add(new ButtonBuffer().getButton("0x7e",AnalyzeClassName,"_0x7e"));
        AnalyzeBox.add(new ButtonBuffer().getButton("BTTools",AnalyzeClassName,"BTTools"));
        AnalyzeBox.add(new ButtonBuffer().getButton("LiqunShield",AnalyzeClassName,"LiqunShield"));
        AnalyzeBox.add(new ButtonBuffer().getButton("Jar反编译",AnalyzeClassName,"JavaDecompiler"));
        AnalyzeBox.add(new ButtonBuffer().getButton("Shiro解密",AnalyzeClassName,"ShiroDec"));
        frame.add(AnalyzeBox);

        // Shell链接工具
        JPanel shellBox = new JPanel(new FlowLayout(FlowLayout.LEFT));
        shellBox.setBorder(BorderFactory.createTitledBorder("Shell链接工具"));
        String shellClassName = "com.CmdRun.ShellConn";
        shellBox.add(new ButtonBuffer().getButton("Horizontal",shellClassName,"Horizontal"));
        shellBox.add(new ButtonBuffer().getButton("CS4.8",shellClassName,"CS48"));
        frame.add(shellBox);

        // 信息收集工具
        JPanel collectBox = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 按钮横向排列
        collectBox.setBorder(BorderFactory.createTitledBorder("信息收集"));
        collectBox.setPreferredSize(new Dimension(800,100));
        String collectClassName = "com.CmdRun.InfoCollect";
        collectBox.add(new ButtonBuffer().getButton("XrayGui",collectClassName,"XrayGui"));
        frame.add(collectBox);

        frame.setLocationRelativeTo(null); // 居中
        frame.setVisible(true);
    }
}
