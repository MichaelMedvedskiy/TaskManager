package test;

import model.Task;
import model.Todo;

public class MyTestMedvedskiy {

    public static void main( final String[] args ){
        Task t = new Task("Clean shitter", "today","My place");
        Task t2 = new Task("Git good", "today","My place");
        Task t3 = new Task("Proga", "today","My place");
        Task t4 = new Task("Do food", "today","My place");
        Todo td = new Todo("Home chores");
        Todo td2 = new Todo("Homework");
        td.addDoable(t);
        td.addDoable(td2);
        td2.addDoable(t2);
        td2.addDoable(t3);
        td.addDoable(t4);
        td.display("    ");

    }

}
