# JSON Data and Java

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise I/O concepts:
- Reading JSON data from a JSON file
- Writing JSON data to a JSON file

For the exercises below, we've provided the starter project above.

This exercise uses the [Jackson](https://github.com/FasterXML/jackson) library.

## :pushpin: Read JSON file

Create a class called `JSONFileHandler` with the following `static` methods:

```java
public List<String> readFile(String filename)
```

The `readFile` method should:
- return a `List<Employee>` object, where each list item is an Employee object (the `Employee.java` class has been provided for you.)

## :pushpin: Write to JSON file

Add the following `static` method to the `JSONFileHandler` class:

```java
public void save(Employee employee, String outputFile)
```

The `save` method should:
- save the given `employee` to the path defined by `outputFile`.
- create `outputFile` if it doesn't exist and update the file to include the new object, if it does.

### :bookmark: Note:
The paths to `inputFile` and `outputFile` are relative to the root directory of this repository (e.g. `exercises/api/src/main/resources/employees.json`)

## :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the provided unit tests.

In your terminal, ensure that you are in the `apis` folder. Then run the following command in your terminal:

```shell
./mvnw clean test
```

If you are on Windows, run this command instead:

```shell
mvnw.cmd clean test
```

### Tests Results

Your implementation is correct when all tests pass:

```shell
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] ├─ App Test Suite - 0.021s
[INFO] │  └─ ✔ creates the app - 0.013s
[INFO] ├─ JSON File Exercise - 0.153s
[INFO] │  ├─ ✔ readFile() throws FilenameException when file is not a .json file - 0.121s
[INFO] │  ├─ ✔ save() adds data to existing file - 0.021s
[INFO] │  ├─ ✔ readFile() returns file contents - 0.003s
[INFO] │  └─ ✔ save() creates new file when file does not yet exist - 0.004s
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.400 s
[INFO] Finished at: 2023-09-29T06:17:43+01:00
[INFO] ------------------------------------------------------------------------

```
## Class usage
Once you've verified your class works correctly, you can utilise it in `App.java`.

Add the following methods and call them from the `main` method:

```java
public static List<Employee> readFile(String filePath) {}

public static void saveToFile(Employee employee, String targetPath) {}
```

The `readFile` method should:
- use the static readFile method in `JSONFileHandler` to read the contents of the sample file we've provided at `resources/example.json`
- return a `List` of `Employee` objects

The `saveToFile` method should:
- use the static `save` method in `JSONFileHandler`  to save a new `Employee` object to a new file at `resources/employees.json`

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/
