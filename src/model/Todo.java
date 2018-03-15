package model;

import java.util.LinkedList;
import java.util.List;


public class Todo extends Doable {

    private String description;
    private List<Doable> doables;
  //  private List<Todo> subTodos;
  //  private List<Task> subTasks;
    private boolean complete;
    private boolean doableComplete;
  //  private boolean subTodoComplete;
  //  private boolean subTaskComplete;


    public Todo(String description) {
        this.description = description;
        doables = new LinkedList<>();
        complete = false;
        doableComplete = false;

    }

    // getters
    public List<Doable> getDoables() { return doables; }
    public boolean getStatus() { return complete; }

    /**
     *
     * @param dbl the item we want to add to our subtodos
     * @return true if we are able to add the item with no duplicates, else false
     */
    public boolean addDoable(Doable dbl) {
        if (!doables.contains(dbl)) {
            doables.add(dbl);
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param dbl the item we want to remove from our subtodos
     * @return true if we are able to remove the item from our subtodos, else false
     */
    public boolean removeDoable(Doable dbl) {
        if (doables.contains(dbl)) {
            doables.remove(dbl);
            return true;
        } else {
            return false;
        }
    }


    /**
     *
     * @param t the task we want to add to our subtasks
     * @return true if we are able to add the item to our subtasks, else false
     */
     /*
    public boolean addTask(Task t) {
        if (!subTasks.contains(t)) {
            subTasks.add(t);
            return true;
        } else {
            return false;
        }
    }
*/
    /**
     *
     * @param t the task we want to remove from our subtasks
     * @return true if we are able to add the item to our subtasks, else false
     */
//    public boolean removeTask(Task t) {
////        if (subTasks.contains(t)) {
////            subTasks.remove(t);
////            return true;
////        } else {
////            return false;
////        }
////    }

    /**
     *
      * @return true if the this subtodos are complete
     */
    public boolean doableComplete() {
        boolean areTodosComplete = true;
        for (Doable dbl : doables) {
            if (!dbl.getStatus()) {
                areTodosComplete = false;
            }
        }
        doableComplete = areTodosComplete;
        return doableComplete;
    }

    /**
     *
     * @return true if this subtasks are complete
     */
    /*
    public boolean subTaskComplete() {
        boolean aresubTasksComplete = true;
        for (Task t : subTasks) {
            if (!t.getStatus()) {
                aresubTasksComplete = false;
            }
        }
        subTaskComplete = aresubTasksComplete;
        return subTaskComplete;
    }

*/
    /**
     *
     * @return true if THIS subtask is complete
     */
    /*
    public boolean isThisTodoComplete() {
        complete = subTodoComplete && subTaskComplete;
        return complete;
    }
    */

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void display(String indentSpace) {
        String localIS = indentSpace + indentSpace;
        System.out.println(localIS+"•••"+this.getDescription());
        for(Doable doable : doables){
            doable.display(localIS);
        }
    }
}