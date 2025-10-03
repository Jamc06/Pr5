package model;

public class DaemonProcess extends Process {

    public DaemonProcess(int pid, String name) {
        super(pid, name);
    }

    @Override
    public void execute() {
        System.out.println(getName() + " (Daemon Process) is running in background...");
    }
}