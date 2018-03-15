package model;

public abstract class Doable {
    boolean complete;


    public void doComplete(){
        this.complete=true;
    }

    public boolean getStatus(){return complete;}

    public abstract String getDescription();

    public abstract void display(String indentSpace);


}
