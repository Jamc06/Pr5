package model;
// Clase que representa un proceso Daemon
public class DaemonProcess extends Process {

    public DaemonProcess(int pid, String name) {
        super(pid, name);
    }

    @Override
    public void execute() {
       System.out.println(getName() + " (Proceso Daemon) se está ejecutando en segundo plano...");
    }
}