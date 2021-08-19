package com.company.todo.constant;

public interface Constants {

    interface TodoConstant {
        String CREATE_TASK = "Create Task ";
        String ALL_TASK = "All Task ";
        String FIND_TASK_BY_CODE = "Find Task By Code ";
        String DELETE_TASK = "Delete Task ";

        String FIRST = "1";
        String SECOND = "2";
        String THIRD = "3";
        String FOURTH = "4";

        String TASK_NAME = "Task Name";
        String PRIORITY = "Priority";
        String COMMENT = "Add Comment";
        String CREATED_BY = "Create By";
        String ASSIGN = "Assign to";

        String ENTER_TASK_CODE = "Enter Task Code";

        int SIZE = 30;
        String DESIGN_FORMAT = "-";
    }

    interface TodoResponseConstant {
        String TODO_NAME = "TODO NAME: ";
        String TODO_PRIORITY = "PRIORITY: ";
        String TODO_CODE = "TODO CODE: ";
        String TODO_COMMENT = "COMMENT: ";
        String TODO_CREATED_BY = "CREATED BY: ";
        String TODO_CREATED_AT = "CREATED AT: ";
        String TODO_ASSIGN_TO = "ASSIGN TO: ";
        String DESIGN_RESPONSE = "=";
        int RESPONSE_SIZE = 30;

        String SUCCESSFULLY_DELETED= "Successfully deleted";
    }
}