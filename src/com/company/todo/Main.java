package com.company.todo;

import com.company.todo.service.TodoService;

public class Main {
    public static void main(String[] args) {
        TodoService todoService = new TodoService();
        todoService.start();
        /**
         * App yeni baslayanlar ucun komek meqsedi ile yazilmisdir, Her hansisa exception try catch olunmayib
         * Real DataBase qosulmayib
         */
    }
}
