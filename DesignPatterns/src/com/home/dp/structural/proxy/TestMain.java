package com.home.dp.structural.proxy;

import java.io.IOException;

public class TestMain {
    
    public static void main(String[] args) throws IOException {
        
        CommandExecutor commandExecutor = new CommandExecutorProxy("user", "password");
        commandExecutor.executeCommand("pwd");
        
        commandExecutor.executeCommand("rm");
    }
    
}   
