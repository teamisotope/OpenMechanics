package com.teamisotope.openmechanics.api.task;

import java.util.ArrayList;

public class TaskList<T extends Task> {

    public ArrayList<T> tasksList;

    public TaskList() {
        this.tasksList = new ArrayList<>();
    }

    public void run(Task.TaskEnvironment env) {
        for (T task : tasksList) {
            if (task.testEnvironment(env)) {
                try {
                    task.run(env);
                } catch (TaskMalformedInputException err) {
                    err.printStackTrace();
                }
            }
        }
    }

    public void register(T task) {
        tasksList.add(task);
    }

    public void register(int index, T task) {
        tasksList.set(index, task);
    }

    public void remove(int index) {
        tasksList.remove(index);
    }

    public void remove(T task) {
        tasksList.remove(task);
    }

    public int getIdFromTask(T task) {
        return tasksList.indexOf(task);
    }

    public T getTaskFromId(int index) {
        return tasksList.get(index);
    }



}
