package com.home.dp.structural.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{

    @Override
    public void executeCommand(String command) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec(command);
        System.out.println("Executed : "+command);
    }

}
