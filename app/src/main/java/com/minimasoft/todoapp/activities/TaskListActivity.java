package com.minimasoft.todoapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.minimasoft.todoapp.R;
import com.minimasoft.todoapp.screens.taskList.TaskListViewImplementation;

public class TaskListActivity extends AppCompatActivity {

    private TaskListViewImplementation taskListViewImplementation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        taskListViewImplementation = new TaskListViewImplementation(getLayoutInflater(),null);
        setContentView(taskListViewImplementation.getRootView());
    }
}
