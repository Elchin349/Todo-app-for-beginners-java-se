package com.company.todo.db;

import com.company.todo.model.TodoModel;

/**
 * Array ler statik oldugu ucun biz onu dinamik hala getirmek ucun
 * asagidaki mentiqi qururuq
 * onceden capacity ni 10 edirik sonra her defesinde capacity dolanda 2 e vurub artitiriq
 * Bunu anladiginzida Collection Data Structure i da yaxsi qavramis olacaqsiz
 * Kodu Debug ederek arasdirin
 * Ugurlar :)))
 */
public class FakeTodoDB {
    private int capacity;
    private int currentLength;
    private TodoModel[] todoModels;

    public FakeTodoDB() {
        this.todoModels = new TodoModel[10];
        this.capacity = 10;
        this.currentLength = 0;
    }

    public TodoModel createTodo(TodoModel t) {
        if (currentLength == capacity) {
            TodoModel[] tempArray = new TodoModel[2 * capacity];

            System.arraycopy(todoModels, 0, tempArray, 0, todoModels.length);
            todoModels = tempArray;
            capacity *= 2;
        }
        todoModels[currentLength] = t;
        currentLength++;
        return t;
    }

    public TodoModel[] getAllTodo() {
        TodoModel[] tempArray = new TodoModel[currentLength];
        System.arraycopy(todoModels, 0, tempArray, 0, currentLength);
        return tempArray;
    }

    public TodoModel getTodoByCode(String code) {
        for (TodoModel t : todoModels) {
            if (t.getCode().equals(code)) {
                return t;
            }
        }
        return null;
    }

    public boolean deleteTodoByCode(String code) {
        for (int i = 0; i < todoModels.length; i++) {
            if (todoModels[i].getCode().equals(code)) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    private void pop() {
        if (currentLength > 0) {
            currentLength--;
        }
    }

    private void delete(int index) {
        if (index > -1 && index < currentLength) {
            if (index == currentLength - 1) {
                pop();
            } else {
                System.arraycopy(todoModels, index + 1, todoModels, index, currentLength - index);
                currentLength--;
            }
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
