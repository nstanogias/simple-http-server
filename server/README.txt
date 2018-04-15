Hej!

The goal with the assignment is to show how you take on implementing a simple
Java-projekt. You choose how much time and how full-blown you want the solution to be.
It's good to takes notes on how you reasoned.

Good luck!

=== Time and boundaries

It is important that you implement a subset of the functionality complete
rather than implementing parts sporadically or take on everything and
think the task is too time consuming. Then choose rather to implement a
subset, for example, CREATE or DOWNLOAD.

=== Assignment

Write an HTTP server that stores and provides information
about people. The data does not need to be stored persistently.
XML is used for all input.
JSON used for all output.

=== Specifikation

1. Create person:
    POST http://127.0.0.1:8080/person
    * In the response, the address of the created person should be set as the value for the location header.
    * It is up to you how repeated calls to CREATE are handled, either create new persons or return an existing one

2. Update person:
    PUT http://127.0.0.1:8080/person/<id>
    * New data should overwrite old data

3. Get given person:
    GET  http://127.0.0.1:8080/person/<id>
    * Response with a JSON that corresponds to the format in the [verification]-module
   
4: List all persons or only those given by a gender parameter:
    GET  http://127.0.0.1:8080/person?[gender=<male|female>]
    * Response with a JSON with all persons
    * If the parameter [gender] is sent then only show persons of that gender

=== Test

You can test by your self by running:
1. from server-projektet, run: [mvn jetty:run]
2. Execute CRUD operations from POSTMAN or with curl