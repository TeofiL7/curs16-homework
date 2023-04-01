package org.fasttrackit;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                Person.builder()
                        .firstName("Mihai")
                        .lastName("Bogdan")
                        .age(23)
                        .city("Cluj")
                        .build(),
                Person.builder()
                        .firstName("Albert")
                        .lastName("Xi")
                        .age(27)
                        .city("Oradea")
                        .build(),
                Person.builder()
                        .firstName("Marius")
                        .lastName("Catalin")
                        .age(44)
                        .city("Cluj")
                        .build(),
                Person.builder()
                        .firstName("Jhon")
                        .lastName("Zanfir")
                        .age(61)
                        .city("Pitesti")
                        .build(),
                Person.builder()
                        .firstName("Marcel")
                        .lastName("Popoviciu")
                        .age(32)
                        .city("Satu Mare")
                        .build(),
                Person.builder()
                        .firstName("Catalina")
                        .lastName("Malaies")
                        .age(17)
                        .city("Timisoara")
                        .build(),

                Person.builder()
                        .firstName("Jhon")
                        .lastName("Carol")
                        .age(61)
                        .city("Pitesti")
                        .build()
        );
        PersonService personService = new PersonService(personList);
        System.out.println("\nPersons names: \n" + personService.listAllPersons());
        System.out.println("\nPersons that are major: \n" + personService.listMajorPersons());
        System.out.println("\nPersons From Oradea: \n" + personService.allFromOradea());
        System.out.println("\nPersons From Oradea or Cluj: \n" + personService.allFromOradeaOrCluj());
        System.out.println("\nFirst names CAPITALIZED: \n" + personService.allFirstNamesCAPITALIZED());
        System.out.println("\nPersons age 18 to 60: \n" + personService.list18to60());
        System.out.println("\nAll persons names start with 'A': \n" + personService.listPersonsStartWithA());
        System.out.println("\nList all persons UNIQUELY: \n" + personService.listUNIQUELY());
        System.out.println("\nPersons sort by first name: \n" + personService.sortByFirstName());
        System.out.println("\nPersons sort by last name: \n" + personService.sortByLastName());
        System.out.println("\nPersons sort by first, last name and age: \n" + personService.sortByFirstAndLast());
    }
}