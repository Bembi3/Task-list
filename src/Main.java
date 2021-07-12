import java.util.Scanner;

public class Main {
    static TaskList taskList = new TaskList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menu Cycle
        while (true) {
            System.out.println("");
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход\n");
            int input = scanner.nextInt();
            switch (input) {
                case (1):
                    addTasks();
                    continue;
                case (2):
                    showTasks();
                    continue;
                case (3):
                    deleteTasks();
                    continue;
                case (0):
                    System.exit(0);
                default:
                    System.out.println("Выберите пункт меню от 1 до 3 или нажмите 0 для выхода");
            }
        }
    }

    private static void deleteTasks() {
        Scanner deleteTaskScanner = new Scanner(System.in);
        System.out.println("Введите номер задачи для удаления:");
        int input = deleteTaskScanner.nextInt();
        taskList.deleteTask(input);

    }

    private static void showTasks() {
        taskList.showTasks();
    }

    private static void addTasks() {
        Scanner addTaskScanner = new Scanner(System.in);
        System.out.println("Введите задачу для планирования:");
        String input = addTaskScanner.nextLine();
        taskList.addTask(input);
    }
}