package com.example.demo.Model;

public class todo {
    public int ID;
    public String Todo;

    public todo(int ID, String Todo){
        this.ID = ID;
        this.Todo = Todo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTodo() {
        return Todo;
    }

    public void setTodo(String todo) {
        Todo = todo;
    }
}
