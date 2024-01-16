package Assignment_9;

import java.time.LocalDateTime;

public class HoneyToDoListMain {
    public static void main(String[] args) {
        HoneyToDoList honeydo = new HoneyToDoList();

        System.out.println(honeydo);
        honeydo.addTask(new Task("take asprin", 1, 120, LocalDateTime.of(2023, 12, 23, 13, 0)));
        System.out.println(honeydo);
        honeydo.addTask(new Task("take asprin again", 1, 150, LocalDateTime.of(2023, 12, 23, 13, 0)));
        System.out.println(honeydo);
        System.out.println(honeydo.getTask(honeydo.shortestTime()));

    }

}
