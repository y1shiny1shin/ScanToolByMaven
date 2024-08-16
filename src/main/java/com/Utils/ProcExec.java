package com.Utils;

import java.io.IOException;

public class ProcExec {
    public void ProcExecRun(String cmd) throws IOException {
        String[] cmdList = cmd.split(" ");
        ProcessBuilder pb = new ProcessBuilder(cmdList);
        pb.start();
    }
}
