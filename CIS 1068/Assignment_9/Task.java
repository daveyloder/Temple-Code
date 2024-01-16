package Assignment_9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String name;
    private int priority;
    private int estMinsToComplete;
    private LocalDateTime whenDue;
    // Format localdatetime to yyyy-mm-dd

    public Task(String taskName, int taskPriority, int taskMinToComplete, LocalDateTime taskDueDate) {
        name = taskName;
        priority = taskPriority;
        estMinsToComplete = taskMinToComplete;
        whenDue = taskDueDate;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getEstMinsToComplete() {
        return estMinsToComplete;
    }

    public LocalDateTime getWhenDue() {
        return whenDue;
    }

    public String setName(String newName) {
        return name = newName;
    }

    public int setEstMinsToComplete(int x) {
        return estMinsToComplete = x;
    }

    public LocalDateTime setWhenDue(int year, int month, int day, int hour, int minute) {
        LocalDateTime newDate = LocalDateTime.of(year, month, day, hour, minute);
        return whenDue = newDate;
    }

    public int increasePriority(int amount) {
        if (amount < 0) {
            return priority;
        } else {
            return priority += amount;
        }
    }

    public int decreasePriority(int amount) {
        if (amount > 0) {
            if ((amount - priority) > 0) {
                return priority;
            } else {
                return priority -= amount;
            }
        }
        return priority;
    }

    public boolean overdue() {
        if ((LocalDateTime.now()).isAfter(whenDue)) {
            return true;
        }
        return false;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return "Task Name: " + name + "\nTask Priority: " + priority + "\nEst. Minutes to complete: "
                + estMinsToComplete + "\nDue Date: " + whenDue.getMonth() + " " + whenDue.getDayOfMonth() + ", "
                + whenDue.getYear() + " at " + whenDue.format(formatter);
    }
}
