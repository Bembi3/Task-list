import java.util.ArrayList;

public class TaskList {
    static ArrayList<String> tasks = new ArrayList<String>();

    public void addTask(String task){
        tasks.add(task);
    }

    public void deleteTask(int task){
        if (task >0){
            task--;
        }
        tasks.remove(task);
        showTasks();
    }

    public void showTasks(){
        if (tasks.isEmpty()){
            System.out.println("Список пуст");
        }
        int i = 1;
        for(String task : tasks){
            System.out.println(i + ". " +task);
            i++;
        }
    }
}