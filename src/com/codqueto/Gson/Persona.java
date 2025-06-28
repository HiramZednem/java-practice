package com.codqueto.Gson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class Persona {
    private String name;
    private Integer age;
    private boolean isStudent;
    private String[] hobbies;
}
