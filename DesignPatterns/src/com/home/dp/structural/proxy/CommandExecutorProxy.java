package com.home.dp.structural.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isPermission;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String password) {
        if ("username".equals(user) && "password".equals(password)) {
            this.isPermission = true;
        }
        this.commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void executeCommand(String command) throws IOException {
        if (isPermission) {
            commandExecutor.executeCommand(command);
        } else {
            if (command != null && command.indexOf("rm") != -1)
                throw new IOException("Command is not allowed for non- admin users.");
            else
                commandExecutor.executeCommand(command);
        }
    }

}
