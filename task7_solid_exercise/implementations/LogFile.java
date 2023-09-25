package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LogFile implements File {
    private static final String DEFAULT_FILE_NAME = "default.txt";

    private StringBuilder text;
    private int size;
    private String fileName;

    public LogFile() {
        this(DEFAULT_FILE_NAME);
    }

    public LogFile(String fileName) {
        this.text = new StringBuilder();
        this.size = 0;
        this.fileName = fileName;
    }

    @Override
    public int getSize() {
        return this.calculateSizeSymbols();
    }

    @Override
    public boolean write(String text) {
        try {
            Files.write(Paths.get(this.fileName),text.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void append(String text) {
        String string = addLineBreakInFile(text);
        this.text.append(string);
        this.write(string);
    }


    private int calculateSizeSymbols(){
        int size = 0;

        for(char symbol : this.text.toString().toCharArray()){
            if(Character.isAlphabetic(symbol)){
                size+=symbol;
            }
        }
        return size;
    }

    public String addLineBreakInFile(String text){
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.append(System.lineSeparator());
        return stringBuilder.toString();
    }
}
