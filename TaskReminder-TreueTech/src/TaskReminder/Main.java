package TaskReminder;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    taskManager.addTask(taskName);
                    break;
                case 2:
                    taskManager.listTasks();
                    break;
                case 3:
                    System.out.print("Enter task name to remove: ");
                    String taskToRemove = scanner.nextLine();
                    taskManager.removeTask(taskToRemove);
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


