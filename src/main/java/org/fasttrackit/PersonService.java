package org.fasttrackit;

import java.util.*;
import java.util.stream.Collectors;

public class PersonService {
    private  List<Person> personList = new ArrayList<>();

    public PersonService(List<Person> personList) {
        if (personList != null)
            this.personList.addAll(personList);
    }

    public List<String> listAllPersons(){
        List<String> result = personList.stream()
                .map(person -> person.getFirstName() + "~" + person.getLastName())
                .toList();
        return result;
    }

    public List<Person> listMajorPersons(){
        List<Person> result = personList.stream()
                .filter(person -> person.getAge() > 18)
                .toList();
        return result;
    }

    public List<Person> allFromOradea() {
        List<Person> result = personList.stream()
                .filter(person -> person.getCity().contains("Oradea"))
                .toList();
        return result;
    }

    public List<Person> allFromOradeaOrCluj() {
        List<Person> result = personList.stream()
                .filter(person -> person.getCity().contains("Oradea") || person.getCity().contains("Cluj"))
                .toList();
        return result;
    }

    public List<String> allFirstNamesCAPITALIZED(){
        List<String> result = personList.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .toList();
        return result;
    }

    public List<Person> list18to60(){
        List<Person> result = personList.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() < 60)
                .toList();
        return result;
    }

    public List<Person> listPersonsStartWithA(){
        List<Person> result = personList.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .toList();
        return result;
    }

    public List<String> listUNIQUELY(){
        List<String> result = personList.stream()
                .map(Person::getFirstName)
                .distinct()
                .toList();
        return result;
    }

    public List<Person> sortByFirstName(){
        List<Person> result = personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .toList();
        return result;
    }

    public List<Person> sortByLastName(){
        List<Person> result = personList.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .toList();
        return result;
    }

    public List<Person> sortByFirstAndLast(){
        List<Person> result = personList.stream()
                .toList();
        Collections.sort(personList, Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
                .thenComparing(Person::getAge));
        return result;
    }

}

