package com.home.dp.structural.proxy;

import java.io.IOException;

public interface CommandExecutor {

    void executeCommand(String command) throws IOException;
}
