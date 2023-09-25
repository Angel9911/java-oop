package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.factories.LoggerFactory;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputParser inputParser = new InputParser();
        String readInput = inputParser.readLoggerInfo(scanner);

        LoggerFactory loggerFactory = new LoggerFactory();

        Logger logger = loggerFactory.process(readInput);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String[] tokens = input.split(" ");

            ReportLevel reportLevel = ReportLevel.valueOf(tokens[0]);
            String time = tokens[1];
            String message = tokens[2];

            switch (reportLevel){
                case INFO: logger.logInfo(time,message);
                case WARNING: logger.logWarning(time,message);
                case ERROR: logger.logError(time,message);
                case CRITICAL: logger.logCritical(time,message);
                case FATAL: logger.logFatal(time,message);
            }
        }
        /*Layout simpleLayout = new SimpleLayout();

        Appender consoleAppender = new ConsoleAppender(simpleLayout);

        consoleAppender.setReportLevel(ReportLevel.ERROR);

        File file = new LogFile();
        Appender fileAppender = new FileAppender(simpleLayout);
        ((FileAppender) fileAppender).setFile(file);

        Logger logger = new MessageLogger(consoleAppender,fileAppender);

        logger.logInfo("3/26/2015 2:09:11 PM", "User pesho successfully registered.");
        logger.logWarning("3/26/2015 2:09:11 PM", "User pesho successfully registered.");
        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logCritical("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logFatal("3/26/2015 2:08:11 PM", "Error parsing JSON."); */
    }
}
