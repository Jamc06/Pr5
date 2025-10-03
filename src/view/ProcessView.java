package view;

import model.Process;
import java.util.ArrayList;

public class ProcessView {

    public void showMenu() {
        System.out.println(" Process Simulator ");
        System.out.println("1. Add CPU Process");
        System.out.println("2. Add I/O Process");
        System.out.println("3. Add Daemon Process");
        System.out.println("4. Execute All Processes");
        System.out.println("5. Show Processes");
        System.out.println("0. Exit");
    }

    public void showProcesses(ArrayList<Process> processes) { // Muestra la lista de procesos
        System.out.println("Procesos Registrados:");
        for (Process p : processes) {
            System.out.println(p);
        }
    }

    public void showMessage(String msg) { // Muestra un mensaje simple
        System.out.println(msg);
    }
}
