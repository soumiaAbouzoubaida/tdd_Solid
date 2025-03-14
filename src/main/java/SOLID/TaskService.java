package SOLID;

import java.util.List;

public class TaskService implements TaskPerformer {
    @Override
    public void performTasks(List<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks assigned");
        } else {
            for (String task : tasks) {
                System.out.println("Performing task: " + task);
            }
        }
    }

    @Override
    public void printTasks(List<String> tasks) {
        for (String task : tasks) {
            System.out.println("Task: " + task);
        }
    }
}