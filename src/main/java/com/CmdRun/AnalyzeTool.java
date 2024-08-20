package com.CmdRun;

import com.Utils.ProcExec;

import java.io.IOException;

public class AnalyzeTool {
    public void _0x7e() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/AnalyzeToolDir/0x7eTeamTools && java -jar 0x7e.jar");
    }
    public void BTTools() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/AnalyzeToolDir/ && java -jar BlueTeamTools0.92.jar");
    }
    public void LiqunShield() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/AnalyzeToolDir/LiqunShield && java -jar LiqunShield.jar");
    }
    public void JavaDecompiler() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/AnalyzeToolDir/ && java -jar jd-gui-1.6.6.jar");
    }
    public void ShiroDec() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/AnalyzeToolDir/Shiro_Decrypt && java -jar BlueTeamToolsV4.3.jar");
    }
}
