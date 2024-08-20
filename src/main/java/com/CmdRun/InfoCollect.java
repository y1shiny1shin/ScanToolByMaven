package com.CmdRun;

import com.Utils.ProcExec;

import java.io.IOException;

public class InfoCollect {
    public void XrayGui() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/InfoCollect/xrayGui && java -jar super-xray-1.7.jar");
    }
}
