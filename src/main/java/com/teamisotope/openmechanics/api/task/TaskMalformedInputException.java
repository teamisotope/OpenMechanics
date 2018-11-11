package com.teamisotope.openmechanics.api.task;

public class TaskMalformedInputException extends Exception {

    public TaskMalformedInputException() {
        super("Task inputs are malformed");
    }

}
