package controller;

import model.Process;
import java.util.ArrayList;
// Controlador que maneja la lógica de los procesos
public class ProcessController {
    private ArrayList<Process> processes;

    public ProcessController() {
        processes = new ArrayList<>(); // Inicializa la lista de procesos
    }

    public void addProcess(Process p) {
        processes.add(p);
    }

    public void executeAllProcesses() {
        for (Process p : processes) {
            p.execute();// Llama al método execute de cada proceso
        }
    }

    public ArrayList<Process> getProcesses() {
        return processes;
    }
}
