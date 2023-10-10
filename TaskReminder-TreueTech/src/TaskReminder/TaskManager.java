package TaskReminder;

import java.util.ArrayList;

public class TaskManager {
	 
	    private ArrayList<Task> tasks;

	    public TaskManager() {
	        tasks = new ArrayList<>();
	    }

	    public void addTask(String taskName) {
	        Task task = new Task(taskName);
	        tasks.add(task);
	        System.out.println("Task added: " + taskName);
	    }

	    public void listTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("No tasks available.");
	            return;
	        }

	        System.out.println("Tasks:");
	        for (Task task : tasks) {
	            System.out.println(task.getName());
	        }
	    }

	    public void removeTask(String taskName) {
	        for (int i = 0; i < tasks.size(); i++) {
	            Task task = tasks.get(i);
	            if (task.getName().equals(taskName)) {
	                tasks.remove(i);
	                System.out.println("Task removed: " + taskName);
	                return;
	            }
	        }
	        System.out.println("Task not found: " + taskName);
	    }
	}

