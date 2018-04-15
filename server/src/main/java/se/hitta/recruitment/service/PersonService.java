package se.hitta.recruitment.service;

import se.hitta.recruitment.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PersonService {

    static HashMap<Integer,Person> personHashMap=getPersonIdMap();

    private static HashMap<Integer,Person> getPersonIdMap() {
        return personHashMap;
    }

    public PersonService() {
        if (personHashMap == null) {
            personHashMap = new HashMap<Integer, Person>();

            Person person1 = new Person(1,"nikos", "stanogias", "male", "nikos@gmail.com", "private");
            Person person2 = new Person(2,"bob", "tom", "male", "bob@gmail.com", "private");
            Person person3 = new Person(3,"maria", "ericsson", "female", "maria@gmail.com", "private");

            personHashMap.put(1,person1);
            personHashMap.put(2,person2);
            personHashMap.put(3,person3);
        }
    }

    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<Person>(personHashMap.values());
        return people;
    }

    public Person getPersonById(int id) {
        Person person = personHashMap.get(id);
        return person;
    }

    public Person addPerson(Person person) {
        person.setId(personHashMap.size() + 1);
        personHashMap.put(person.getId(), person);
        return person;
    }

    public Person update(Person person) {
        if(person.getId() < 0) return null;
        personHashMap.put(person.getId(), person);
        return person;
    }

    public void deletePerson(int id) {
        personHashMap.remove(id);
    }
}
