package com.kodilla.spring.portfolio;


import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> task;

    public TaskList(){
        task = new ArrayList<>();
    }

    public boolean addTask(String taskContent){
        return task.add(taskContent);
    }

    @Override
    public String toString(){
        return "TaskList("+ "tasks=" + task + '}';
    }

    public List<String> getTask(){
        return task;
    }

}
