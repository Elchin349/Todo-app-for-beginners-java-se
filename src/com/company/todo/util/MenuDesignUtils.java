package com.company.todo.util;


import com.company.todo.model.TodoModel;

import static com.company.todo.constant.Constants.TodoConstant.DESIGN_FORMAT;
import static com.company.todo.constant.Constants.TodoConstant.SIZE;
import static com.company.todo.constant.Constants.TodoResponseConstant.*;

public class MenuDesignUtils {

    /**
     * Console da System.out.println() ile verilenleri seliqeli dizaynda vermek ucun util
     */
    private static int verifyLen(int strLen) {
        return SIZE - strLen;
    }

    private static String designFormat(int len) {
        return DESIGN_FORMAT.repeat(len);
    }

    private static String menuDesign(String str) {
        return str + designFormat(verifyLen(str.length()));
    }

    public static String menuFormat(String str1, String str2) {
        return menuDesign(str1).concat(str2);
    }

    public static void printResponse(TodoModel todoModel) {
        System.out.println(DESIGN_RESPONSE.repeat(RESPONSE_SIZE));
        System.out.println(TODO_NAME + todoModel.getTaskName());
        System.out.println(TODO_PRIORITY + todoModel.getPriority());
        System.out.println(TODO_CODE + todoModel.getCode());
        System.out.println(TODO_COMMENT + todoModel.getComment());
        System.out.println(TODO_CREATED_BY + todoModel.getCreatedBy());
        System.out.println(TODO_CREATED_AT + todoModel.getCreatedAt());
        System.out.println(TODO_ASSIGN_TO + todoModel.getAssign());
        System.out.println(DESIGN_RESPONSE.repeat(RESPONSE_SIZE));
    }

    public static void printResponseList(TodoModel[] todoModels) {
        for (TodoModel t : todoModels) {
            printResponse(t);
        }
    }
}
