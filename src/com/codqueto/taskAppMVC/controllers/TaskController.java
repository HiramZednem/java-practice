package com.codqueto.taskAppMVC.controllers;

import com.codqueto.taskAppMVC.exceptions.TaskException;
import com.codqueto.taskAppMVC.exceptions.TaskValidationException;
import com.codqueto.taskAppMVC.models.Task;
import com.codqueto.taskAppMVC.models.repositories.TaskRepository;

import java.util.List;


public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController() {
        this.taskRepository = new TaskRepository();
    }

    public void addTask(String id, String title, String description, Boolean completed) throws TaskValidationException, TaskException {
        this.validateTaskData(id, title, description, completed);
        Task task = new Task(id, title, description, completed);
        this.taskRepository.save(task);
        System.out.println("La tarea fue agregada");
    }

    public void removeTask(String id) throws TaskException {
        this.taskRepository.remove(id);
        System.out.println("La tarea se ha eliminado");
    }

    public void showTasks() throws TaskValidationException {
        List<Task> tasks = this.taskRepository.findAll();
        if(tasks.isEmpty()) {
            throw new TaskValidationException("La lista no puede estar vacia");
        }

        for(Task task: tasks) {
            System.out.println(task);
        }
    }

    public void updateTask(String id, String title, String description, Boolean completed) throws TaskValidationException, TaskException {
        this.validateTaskData(id, title, description, completed);
        Task task = new Task(id, title, description, completed);
        taskRepository.update(task);
        System.out.println("La tarea se ha actualizado");
    }

    private void validateTaskData(String id, String title, String description, Boolean completed) throws TaskValidationException {
        if ( id == null || id.trim().isEmpty() ) {
            throw new TaskValidationException("El id no puede ser nulo");
        }

        if ( title == null || title.trim().isEmpty() ) {
            throw new TaskValidationException("El title no puede ser nulo");
        }

        if ( description == null || description.trim().isEmpty() ) {
            throw new TaskValidationException("El description no puede ser nulo");
        }

        if ( completed == null ) {
            throw new TaskValidationException("El completed no puede ser nulo");
        }
    }
}
