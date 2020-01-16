Spring Data JDBC
The primary goal of the Spring Data project is to make it easier to build Spring-powered applications that use data access technologies. Spring Data JDBC offers the popular Repository abstraction based on JDBC.

It aims at being conceptually easy. In order to achieve this it does NOT offer caching, lazy loading, write behind or many other features of JPA. This makes Spring Data JDBC a simple, limited, opinionated ORM.

Features
Implementation of CRUD methods for Aggregates.

@Query annotation

Support for transparent auditing (created, last changed)

Events for persistence events

Possibility to integrate custom repository code

JavaConfig based repository configuration by introducing EnableJdbcRepository

Integration with MyBatis

Getting Help
If you are new to Spring Data JDBC read the following two articles "Introducing Spring Data JDBC" and "Spring Data JDBC, References, and Aggregates"

There are also examples in the Spring Data Examples project.

A very good source of information is the source code in this repository. Especially the integration tests (if you are reading this on github, type t and then IntegrationTests.java)

We are keeping an eye on the (soon to be created) spring-data-jdbc tag on stackoverflow.

If you think you found a bug, or have a feature request please create a ticket in our issue tracker.

Execute Tests
Fast running tests
Fast running tests can be executed with a simple

mvn test
This will execute unit tests and integration tests using an in-memory database.

Running tests with a real database
In order to run the integration tests against a specific database you need to have a local Docker installation available, and then execute.

mvn test -Dspring.profiles.active=<databasetype>
This will also execute the unit tests.

Currently the following databasetypes are available:

hsql (default, does not require a running database)

mysql

postgres

mariadb

mssql
