package controller;

import model.Process;
import java.util.ArrayList;

public class ProcessController {
    private ArrayList<Process> processes;

    public ProcessController() {
        processes = new ArrayList<>();
    }

    public void addProcess(Process p) {
        processes.add(p);
    }

    public void executeAllProcesses() {
        for (Process p : processes) {
            p.execute();
        }
    }

    public ArrayList<Process> getProcesses() {
        return processes;
    }
}
