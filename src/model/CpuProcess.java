package model;
// Clase que representa un proceso de CPU
public class CpuProcess extends Process {

    public CpuProcess(int pid, String name) {
        super(pid, name);
    }

    @Override
    public void execute() {
        System.out.println(getName() + " (CPU Process) esta trabajando duramente...");
    }
}