package model;

public class IoProcess extends Process {

    public IoProcess(int pid, String name) {
        super(pid, name);
    }

    @Override
    public void execute() {
        System.out.println(getName() + " (I/O Process) I/O esta esperando  un input/output...");
    }
}