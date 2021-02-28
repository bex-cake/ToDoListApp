package com.example.mytodolistapp;
import android.provider.BaseColumns;

public class Contract {
    public static final String DB_NAME = "todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "todos";

        public static final String COL_TASK_TITLE = "title";
    }
}
