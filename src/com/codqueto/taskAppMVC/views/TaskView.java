package com.codqueto.taskAppMVC.views;

import com.codqueto.taskAppMVC.controllers.TaskController;
import com.codqueto.taskAppMVC.models.repositories.TaskRepository;

import java.util.Scanner;

public class TaskView {
    private final TaskController taskController;
    private final Scanner scanner;

    public TaskView(TaskController taskController ) {
        this.scanner = new Scanner(System.in);
        this.taskController = taskController;
    }

    public void showMenu() {
        while(true) {
            System.out.println("Gestion de Tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Actualizar tarea");
            System.out.println("4. Mostrar tarea");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion:");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    taskController.addTask();
                    break;
                case "2":
                    taskController.addTask();
                    break;
                case "3":
                    taskController.addTask();
                    break;
                case "4":
                    taskController.addTask();
                    break;
                case "5":
                    taskController.addTask();
                    break;

            }
        }
    }
}
