
public class HoneyToDoList {
    private Task[] tasks;
    private int numTask;
    private int INITIAL_CAPACITY = 1000;

    public HoneyToDoList() {
        tasks = new Task[INITIAL_CAPACITY];
        numTask = 0;
    }

    public String toString() {
        String returnString = "";
        if (tasks[0] == null) {
            return null;
        }
        for (int i = 0; i < numTask; i++) {
            returnString += tasks[i].toString() + "\n";
        }
        return returnString;
    }

    public int find(String name) {
        for (int i = 0; i < numTask; i++) {
            if (tasks[i].getName().equalsIgnoreCase(name)) {
                System.out.print("Index of the Find String Name: ");
                return i;
            }
        }
        return -1;
    }

    public void addTask(Task newTask) {
        tasks[numTask] = newTask;
        numTask++;
    }

    public int totalTime() {
        int totaltime = 0;
        for (int i = 0; i < numTask; i++) {
            totaltime += tasks[i].getEstMinsToComplete();

        }
        System.out.print("Total Time To Do Task: ");
        return totaltime;
    }

    public int shortestTime() {
        if (tasks[0] == null) {
            return -1;
        }
        int x = 0;
        int shortTime = tasks[0].getEstMinsToComplete();
        for (int i = 0; i < numTask; i++) {
            if (shortTime > tasks[i].getEstMinsToComplete()) {
                shortTime = tasks[i].getEstMinsToComplete();
                x = i;
            }
        }
        System.out.print("The Shortest Time To Do Task: " + shortTime + "\n");
        return x;
    }

    public Task completeTask(int index) {
        if (index >= numTask || index < 0) {
            numTask--;
            return null;

        }
        if (numTask == 1) {
            Task removeTask = tasks[0];
            tasks[0] = null;
            numTask--;
            return removeTask;
        }
        if (index == numTask - 1) {
            Task removeTask = tasks[index];
            tasks[index] = null;
            numTask--;
            return removeTask;
        }
        Task removeTask = tasks[index];
        for (int i = 0; i < numTask; i++) {
            tasks[i] = tasks[i + 1];
        }
        tasks[numTask - 1] = null;
        numTask--;
        return removeTask;

    }

    public Task getTask(int index) {
        if (index >= numTask || index < 0) {
            return null;
        } else {
            return tasks[index];
        }
    }

    public Task[] overdueTasks() {
        Task[] overdueTasks = new Task[numTask];
        int x = 0;
        for (int i = 0; i < numTask; i++) {
            if (tasks[i].overdue() == true) {
                overdueTasks[x] = tasks[i];
                x++;
            }

        }
        return overdueTasks;
    }
}
