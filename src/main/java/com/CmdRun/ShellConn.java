package com.CmdRun;

import com.Utils.ProcExec;

import java.io.IOException;

public class ShellConn {
    public void Horizontal() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/ShellConnDir/Horizontal/ && java -jar gogogo-jar-with-dependencies.jar");
    }
    public void CS48() throws IOException{
        new ProcExec().ProcExecRun("cd ToolsDir/ShellConnDir/cs4.8 && ./cobaltstrike");
    }
}
