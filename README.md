# Simple Spring Example
This is a very simple Spring project. It's purpose is to quickly have a running Spring application.

# Project structure and features
Project consists of a web module (frontend part), core module (with business logic).
Project features are:
- [x] Works on Spring, Spring Data JPA, Hibernate.
- [x] Supports in-memory tests (uses H2 database).
- [x] Has integration and unit tests.
- [x] Uses Ehcache as caching solution.

# Importing project into IDE
If you want to import and run the project on IDE (for instance, IntelliJ IDEA) you need to specify "dev" profile in VM options:
```
-Dspring.profiles.active=dev
```

# Building & running the project
Build with Gradle (runs unit and integration tests as well):

```bash
$ gradle clean build
```
and then copy WAR to Tomcat's webapps directory. Open the following URL in browser: http://localhost:8080/simplespringexample/

# TODO
- [x] Create useful core module. For instance, core module could provide API for simple arithmetic operations (addition, subtraction, multiplication, division).
- [x] Add unit tests for core module.
- [x] Use core module in web module.
- [x] Add integration tests for web module.
- [x] Change the name of built WAR.
- [x] Add more user friendly URL for application. For instance, it could be /simplespringexample/ instead of /web-0.0.1/
- [x] Add logger (log4j or slf4j).
- [x] Remove springexample*.jar from build directory.
- [x] Add REST endpoint for Arithmetic service and test for it.
- [x] Configure IntelliJ IDEA settings to support integration-test directory. Since now, after changes in build.gradle this directory is marked as sources root, instead of test root.
- [x] Refactor tests - create abstract integration test class with MockMVC.
- [x] Find out why ArithmeticResourceTest is not run during Gradle build.
- [x] Change the path where WAR is placed after building it.
- [x] Add Spring Data JPA and Hibernate support to the project.
- [x] Add EhCache support to the project.
- [x] Add ability to use different configuration options with *.properties files.
- [x] Use H2 database-in-memory for tests.
- [x] Describe in README.md file what features project have. For instance: configuration via .properties files, in-memory tests etc.
- [ ] Add tests for methods with Ehcache.
- [-] Add jUnit TestSuite or ClassRule to load MockMVC framework once for all classes. (Won't do this).
- [ ] Create automatic Ansible deploy script to Tomcat. Alternative idea is to ship project with embedded Tomcat (thanks for an idea go to: https://github.com/AndriusDap (@AndriusDap)).
- [ ] Review all @Configuration files. Maybe it's worth to merge web module's configuration files into one.
- [ ] Review all build configuration.
