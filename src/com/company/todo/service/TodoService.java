package com.company.todo.service;

import com.company.todo.db.FakeTodoDB;
import com.company.todo.model.TodoModel;

import java.util.Scanner;

import static com.company.todo.constant.Constants.TodoConstant.*;
import static com.company.todo.constant.Constants.TodoResponseConstant.SUCCESSFULLY_DELETED;
import static com.company.todo.util.MenuDesignUtils.*;

public class TodoService {
    private static final Scanner scanner = new Scanner(System.in);
    private final FakeTodoDB fakeTodoDB;

    public TodoService() {
        this.fakeTodoDB = new FakeTodoDB();
    }

    public void start() {
        selectFromMenu();
        start();
    }

    private void menu() {
        System.out.println();
        System.out.println(menuFormat(CREATE_TASK, FIRST));
        System.out.println(menuFormat(ALL_TASK, SECOND));
        System.out.println(menuFormat(FIND_TASK_BY_CODE, THIRD));
        System.out.println(menuFormat(DELETE_TASK, FOURTH));
        System.out.println();
    }

    private void selectFromMenu() {
        menu();
        String select = scanner.nextLine();
        checkSelection(select);
    }

    private void checkSelection(String select) {
        switch (select) {
            case FIRST -> printResponse(createTask());
            case SECOND -> printResponseList(showAllTodo());
            case THIRD -> printResponse(findByCode());
            case FOURTH -> deleteTodoByCode();
        }
    }

    private TodoModel createTask() {
        TodoModel todo = new TodoModel();
        System.out.println(TASK_NAME);
        todo.setTaskName(scanner.nextLine());
        System.out.println(PRIORITY);
        todo.setPriority(scanner.nextLine());
        System.out.println(COMMENT);
        todo.setComment(scanner.nextLine());
        System.out.println(CREATED_BY);
        todo.setCreatedBy(scanner.nextLine());
        System.out.println(ASSIGN);
        todo.setAssign(scanner.nextLine());
        todo = fakeTodoDB.createTodo(todo);
        return todo;
    }

    private TodoModel[] showAllTodo() {
        return fakeTodoDB.getAllTodo();
    }

    private String enterTodoCode() {
        System.out.println(ENTER_TASK_CODE);
        return scanner.nextLine();
    }

    private TodoModel findByCode() {
        return fakeTodoDB.getTodoByCode(enterTodoCode());
    }

    private void deleteTodoByCode() {
        fakeTodoDB.deleteTodoByCode(enterTodoCode());
        System.out.println(SUCCESSFULLY_DELETED);
    }

}
