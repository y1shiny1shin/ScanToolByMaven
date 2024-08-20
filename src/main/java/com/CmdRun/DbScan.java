package com.CmdRun;

import com.Utils.ProcExec;

import java.io.IOException;

public class DbScan {
    public void MUDT() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/DbScanDir/Multiple.Database.Utilization.Tools-2.1.1 && java -jar Multiple.Database.Utilization.Tools-2.1.1-jar-with-dependencies.jar");
    }
    public void oracleShell() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/DbScanDir/ && java -jar oracleShell.jar");
    }
    public void postgresql() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/DbScanDir/postgreSql && java -jar postgreUtil.jar");
    }
}
