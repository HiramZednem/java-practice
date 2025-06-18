package com.codqueto.exceptions.studentSystem;

import com.codqueto.exceptions.studentSystem.entities.Student;
import com.codqueto.exceptions.studentSystem.exceptions.DuplicateStudentException;
import com.codqueto.exceptions.studentSystem.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistrationSystem {

    private List<Student> studentList;

    public StudentRegistrationSystem() {
        this.studentList = new ArrayList<>();
    }

    public void registerStudent(String name, int edad, String id) throws DuplicateStudentException {
        validateStudentData(name, edad, id);
        if(isStudentRegistered(id)) throw new DuplicateStudentException("El estudiante que intentas registrar ya existe");
        this.studentList.add(new Student(name, edad, id));
        System.out.println("Estudiante registrado correctamente.");
    }

    public void removeStudent(String id) throws StudentNotFoundException {

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            if ( iterator.next().getId().equals(id) ) {
                iterator.remove();
                System.out.println("El estudiante ha sido eliminado");
                return;
            }
        }

        throw new StudentNotFoundException("El estudiante no existe");
    }

    private boolean isStudentRegistered(String id) {
//        JAJA me pase de burger con este metodo, pero bueno hace lo que queria, pero hay un caso llamado anymatch xd
//        que quede de recuerdo JAJA de cuando no sabia java funcional
//       return !this.studentList.stream().filter( student -> student.getId().equals(id.trim()) ).toList().isEmpty();
        return this.studentList.stream()
                .anyMatch(student -> student.getId().equals(id.trim()));
    }

    private void validateStudentData(String name, int edad, String id) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (id.trim().isEmpty()) {
            throw new IllegalArgumentException("El id no puede estar vacío");
        }

        if( edad < 17 || edad > 100 ) {
            throw  new IllegalArgumentException("La edad debe estar entre 17 y 100 años");
        }

        if( !id.matches("^[A-Z]\\d{5}$") ) {
            throw new IllegalArgumentException("El ID debe seguir el formato: una letra mayúscula seguida de 5 dígitos (ejemplo: A12345)");
        }
    }
}
