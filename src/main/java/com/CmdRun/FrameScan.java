package com.CmdRun;

import com.Utils.ProcExec;

import java.io.IOException;

public class FrameScan {
    public void JBossScan() throws IOException {
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir && java -jar JavaJBoss.jar");
    }
    public void SpringBootGui() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir && java -jar SpringBootExploit-1.3.jar");
    }
    public void TomcatAttack() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/tomcat && java -jar AttackTomcat.jar");
    }
    public void ThinkPHP_bybewhale() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/thinkphp && java -jar ThinkPHP_bybewhale.jar");
    }
    public void ThinkPHPRCE() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/thinkphp && java -jar thinkphpRCE.jar");
    }
    public void ThinkPHPGUI_byLianHua() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/thinkphp && java -jar ThinkPHPGUI_byLianHua.jar");
    }
    public void Struts2Bypass() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/Struts2 && java -jar Strruts2全版本漏洞测试工具17-6过WAF版.jar");
    }
    public void Struts2ALL() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/Struts2 && java -jar Struts2_19.21.jar");
    }
    public void JenKinsGui() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/JenKins && java -jar JenkinsExploit-GUI-1.3-SNAPSHOT.jar");
    }
    public void ShiroAttack47() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/shiro/shiro_attack-4.7 && java -jar shiro_attack-4.7.0-SNAPSHOT-all.jar");
    }
    public void ShiroExpliot() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/shiro/ShiroExploit.V2.51 && java -jar ShiroExploit.jar");
    }
    public void ShiroWithNoCC() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/shiro/ && java -jar Shiro-550-with-NoCC.jar");
    }
    public void NacosExploitGui() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/ && java -jar NacosExploitGUI_v4.0.jar");
    }
    public void WebLogicBysp4z() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/weblogic/WeblogicExploit-GUI_bysp4z && java -jar Weblogic-GUI.jar");
    }
    public void WebLogicBy21superman() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/weblogic/ && java -jar weblogic_exploit_by21superman.jar");
    }
    public void WebLogicByKimJun() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/FrameScanDir/weblogic/ && java -jar WeblogicTool_1.3_byKimJun.jar");
    }
}
