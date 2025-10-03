import model.*;
import controller.ProcessController;
import view.ProcessView;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessController controller = new ProcessController();
        ProcessView view = new ProcessView();

        int option;
        int pidCounter = 1;

        do {
            view.showMenu();
            option = sc.nextInt();
            sc.nextLine(); // clean buffer

            switch (option) {
                case 1:
                    controller.addProcess(new CpuProcess(pidCounter++, "CPU_Task"));
                    view.showMessage("Proceso de CPU agregado.");
                    break;
                case 2:
                    controller.addProcess(new IoProcess(pidCounter++, "IO_Task"));
                    view.showMessage("Proceso de Input/Output agregado.");
                    break;
                case 3:
                    controller.addProcess(new DaemonProcess(pidCounter++, "Daemon_Task"));
                    view.showMessage("Proceso Daemon agregado.");
                    break;
                case 4:
                    controller.executeAllProcesses();
                    break;
                case 5:
                    view.showProcesses(controller.getProcesses());
                    break;
                case 0:
                    view.showMessage("Saliendo del simulador...");
                    break;
                default:
                    view.showMessage("Opción no valida . Intente de nuevo.");
            }
        } while (option != 0);
        sc.close();
    }
}
