package com.Utils;

import java.io.IOException;

public class ProcExec {
    public void ProcExecRun(String cmd) throws IOException {
        // 如果是windows系统，将这里改为
        // String[] cmdList = {"cmd.exe","/c",cmd}
        String[] cmdList = {"bash","-c",cmd};
        ProcessBuilder pb = new ProcessBuilder(cmdList);
        pb.start();
    }
}
