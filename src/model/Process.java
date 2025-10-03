package model;


// Clase abstracta que representa un proceso genérico 

public abstract class Process {
    private int pid;
    private String name;

    public Process(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(); // Método abstracto que debe ser implementado por las subclases

    @Override
    public String toString() {
        return "PID: " + pid + ", Name: " + name;
    }
}
