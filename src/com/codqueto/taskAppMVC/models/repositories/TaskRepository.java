package com.codqueto.taskAppMVC.models.repositories;

import com.codqueto.taskAppMVC.exceptions.TaskException;
import com.codqueto.taskAppMVC.models.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private final List<Task> taskList = new ArrayList<>();

    public void save( Task task ) throws TaskException {
        if( task == null ) {
            throw new TaskException("La tarea no puede ser nula");
        }
        taskList.add(task);
    }

    public Task findById( String id ) {
        for (Task task : taskList  ) {
            if (task.getId().equals(id)) return task;
        }
        return null;
    }

    public void remove( String id ) throws TaskException {
        Task task = findById(id);
        if (task == null) {
            throw new TaskException("La tarea no puede ser nula");
        }
        taskList.remove(task);
    }

    public void remove( Task task ) throws TaskException {
        if (task == null) {
            throw new TaskException("La tarea no puede ser nula");
        }

        if(!taskList.contains(task)) {
            throw new TaskException("La tarea no existe");
        }
        taskList.remove(task);
    }

    public List<Task> findAll() {
        return taskList;
    }

    public int findIndexById ( String id ) {
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getId().equals(id)) return i;
        }
        return -1;
    }

    public void update( Task updatedTask ) throws TaskException {
        if(updatedTask == null) {
            throw new TaskException("La tarea no puede ser nula");
        }

        int index = findIndexById(updatedTask.getId());
        if(index == -1) {
            try {
                throw new TaskException("La tarea no existe");
            } catch (TaskException e) {
                throw new RuntimeException(e);
            }
        }
        taskList.set(index, updatedTask );
    }

}
