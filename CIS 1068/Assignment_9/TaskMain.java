package Assignment_9;

import java.time.LocalDateTime;

public class TaskMain {
    public static void main(String[] args) {
        Task task1 = new Task("Get hw done", 1, 180, LocalDateTime.of(2023, 12, 23,
                13, 0));
        System.out.println(task1);
        task1.setName("Getting bananas");
        task1.decreasePriority(2);
        task1.setWhenDue(2023, 12, 24, 13, 0);
        System.out.println(task1.overdue());
        System.out.println(task1);

    }
}
