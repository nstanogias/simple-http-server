package se.hitta.recruitment.controller;

import se.hitta.recruitment.model.Person;
import se.hitta.recruitment.service.PersonService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
public class PersonController {

    PersonService personService = new PersonService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> listPeople() {
        List<Person> personList = personService.getAllPeople();
        return personList;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonById(@PathParam("id") int id) {
        return personService.getPersonById(id);
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public Person addPerson(Person person) {
        return personService.addPerson(person);
    }

    @PUT
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public Person updatePerson(Person person) {
        return personService.update(person);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deletePerson(@PathParam("id") int id) {
        personService.deletePerson(id);
    }
}
