package com.cbfacademy.FileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cbfacademy.Employee.Employee;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JSONFileHandler {
    public static List<Employee> readFile(String filename) throws FilenameException, IOException {
        if (!filename.endsWith(".json")) {
            throw new FilenameException("Invalid file name");
        }
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filename);
        }
        Reader reader = new FileReader(filename);
        Gson gson = new Gson();
        List<Employee> myList = Arrays.asList(gson.fromJson(reader, Employee[].class));
        reader.close();
        return myList;
    }

    public static void save(Employee employee, String outputFile) throws IOException, FilenameException {
        
        File file = new File(outputFile);
        if (!file.exists()) {
            Files.createFile(Paths.get(outputFile));
        }
        Writer writer = new FileWriter(outputFile);
        Gson gson = new Gson();
        writer.write(gson.toJson(employee));
        writer.close();
    }
}
