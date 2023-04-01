package org.fasttrackit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String city;

    @Override
    public String toString(){
        return "\nPerson = firstName-%s, lastName-%s, age-%s, city-%s".formatted(firstName,lastName,age,city);
    }
}
