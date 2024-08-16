package com.CmdRun;

import com.Utils.ProcExec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegrateTool {
    public void oaExpTools() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/IntegrateTool/oa_exp_tools/ && java -jar -javaagent:Exp-Tools-1.2.5-encrypted.jar Exp-Tools-1.2.5-encrypted.jar");
    }

    public void SJ19() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/IntegrateTool/ && java -jar SJ-V1.9.jar");
    }

    public void RuoYiExploit() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/IntegrateTool/ruoyiVuln/ && java -jar ruoyiVuln.jar");
    }

    public void HVV2023() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/IntegrateTool/ && java -jar day2023.jar");
    }

}
