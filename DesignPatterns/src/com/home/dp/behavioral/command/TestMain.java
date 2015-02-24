package com.home.dp.behavioral.command;

public class TestMain {

    public static void main(String[] args) {

        FileInvoker fileInvoker = new FileInvoker(new OpenFileCommand(TestMain.getUnderlyingFileSystem()));
        fileInvoker.execute();
    }

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:" + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }

}
