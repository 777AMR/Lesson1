package com.javacore.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<String> toDoList = new ArrayList<>();

    public void addToList(String task) {
        toDoList.add(task);
    }

    public void addToListAtPosition(int position, String Task) {
        toDoList.add(position, Task);
    }

    public void printToDoList() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));
        }
    }

    public void changeTask(int index, String task) {
        toDoList.set(index, task);
    }

    public void removeTask(String task) {
        toDoList.remove(task);
    }

    public int getTaskPriority(String task) {
        return toDoList.indexOf(task);
    }
}
